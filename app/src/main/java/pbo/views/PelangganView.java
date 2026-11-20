package view;

import controllers.PelangganController;
import java.util.Scanner;
import util.PrintHelper;

public class PelangganView {
    private PelangganController controller;
    private Scanner scanner;

    public PelangganView(PelangganController controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void showMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n=== KELOLA PELANGGAN ===");
            System.out.println("1. Lihat Semua Pelanggan");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Hapus Pelanggan");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1":
                    PrintHelper.cetakSemua(controller.getSemuaPelanggan());
                    break;
                case "2":
                    System.out.print("ID Pelanggan: ");
                    String id = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("No HP: ");
                    String hp = scanner.nextLine();
                    boolean ok = controller.tambahPelanggan(id, nama, hp);
                    System.out.println(ok ? "Pelanggan ditambah." : "ID sudah terdaftar.");
                    break;
                case "3":
                    System.out.print("ID Pelanggan yang dihapus: ");
                    boolean hapus = controller.hapusPelanggan(scanner.nextLine());
                    System.out.println(hapus ? "Pelanggan dihapus." : "ID tidak ditemukan.");
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}