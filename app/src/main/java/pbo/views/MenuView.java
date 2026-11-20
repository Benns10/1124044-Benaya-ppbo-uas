package pbo;

import controllers.MenuController;
import java.util.Scanner;
import util.PrintHelper;

public class MenuView {
    private MenuController controller;
    private Scanner scanner;

    public MenuView(MenuController controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void showMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n=== KELOLA MENU KAFE ===");
            System.out.println("1. Lihat Semua Menu");
            System.out.println("2. Tambah Makanan");
            System.out.println("3. Tambah Minuman");
            System.out.println("4. Lihat Khusus Makanan & Total Harganya");
            System.out.println("5. Hapus Menu");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1":
                    PrintHelper.cetakSemua(controller.getSemuaMenu());
                    break;
                case "2":
                    formTambahMakanan();
                    break;
                case "3":
                    formTambahMinuman();
                    break;
                case "4":
                    var listMakanan = controller.getDaftarMakanan();
                    PrintHelper.cetakSemua(listMakanan);
                    System.out.println("Total nilai menu makanan: Rp" + PrintHelper.hitungTotalHarga(listMakanan));
                    break;
                case "5":
                    System.out.print("Kode menu yang dihapus: ");
                    boolean ok = controller.hapusMenu(scanner.nextLine());
                    System.out.println(ok ? "Menu dihapus." : "Kode tidak ditemukan.");
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void formTambahMakanan() {
        System.out.print("Kode Makanan: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Makanan: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = Double.parseDouble(scanner.nextLine());
        System.out.print("Level Pedas (1-5): ");
        int pedas = Integer.parseInt(scanner.nextLine());

        boolean ok = controller.tambahMakanan(kode, nama, harga, pedas);
        System.out.println(ok ? "Makanan berhasil ditambah." : "Kode sudah dipakai.");
    }

    private void formTambahMinuman() {
        System.out.print("Kode Minuman: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Minuman: ");
        String nama = scanner.nextLine();
        System.out.print("Harga: ");
        double harga = Double.parseDouble(scanner.nextLine());
        System.out.print("Dingin? (y/n): ");
        boolean dingin = scanner.nextLine().equalsIgnoreCase("y");

        boolean ok = controller.tambahMinuman(kode, nama, harga, dingin);
        System.out.println(ok ? "Minuman berhasil ditambah." : "Kode sudah dipakai.");
    }
}