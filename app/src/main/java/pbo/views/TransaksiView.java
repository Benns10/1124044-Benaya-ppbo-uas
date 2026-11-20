package view;

import controllers.MenuController;
import controllers.PelangganController;
import controllers.TransaksiController;
import java.util.Scanner;
import models.Menu;
import models.Pelanggan;
import models.Transaksi;
import util.PrintHelper;

public class TransaksiView {
    private TransaksiController trxController;
    private PelangganController pelangganController;
    private MenuController menuController;
    private Scanner scanner;

    public TransaksiView(TransaksiController trxController, PelangganController pelangganController,
                         MenuController menuController, Scanner scanner) {
        this.trxController = trxController;
        this.pelangganController = pelangganController;
        this.menuController = menuController;
        this.scanner = scanner;
    }

    public void showMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n=== TRANSAKSI KASIR ===");
            System.out.println("1. Buat Transaksi Baru");
            System.out.println("2. Lihat Riwayat Transaksi");
            System.out.println("0. Kembali");
            System.out.print("Pilih: ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1":
                    formBuatTransaksi();
                    break;
                case "2":
                    PrintHelper.cetakSemua(trxController.getSemuaTransaksi());
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void formBuatTransaksi() {
        System.out.print("ID Transaksi: ");
        String idTrx = scanner.nextLine();
        System.out.print("ID Pelanggan: ");
        Pelanggan p = pelangganController.cariPelanggan(scanner.nextLine());
        if (p == null) {
            System.out.println("Pelanggan tidak ditemukan. Tambah pelanggan dulu.");
            return;
        }

        Transaksi trx = new Transaksi(idTrx, p);
        boolean tambahLagi = true;
        while (tambahLagi) {
            System.out.print("Kode Menu yang dipesan: ");
            Menu m = menuController.cariMenu(scanner.nextLine());
            if (m == null) {
                System.out.println("Menu tidak ditemukan.");
            } else {
                System.out.print("Jumlah beli: ");
                int qty = Integer.parseInt(scanner.nextLine());
                trx.tambahItem(m, qty);
                System.out.println("Item ditambahkan.");
            }
            System.out.print("Tambah item lagi? (y/n): ");
            tambahLagi = scanner.nextLine().equalsIgnoreCase("y");
        }

        boolean ok = trxController.simpanTransaksi(trx);
        System.out.println(ok ? "Transaksi tersimpan! Total: Rp" + trx.hitungTotal() : "ID Transaksi sudah ada.");
    }
}