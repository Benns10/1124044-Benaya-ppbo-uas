package pbo;

import controllers.MenuController;
import controllers.PelangganController;
import controllers.TransaksiController;
import java.util.Scanner;
import views.MenuView;
import views.PelangganView;
import views.TransaksiView;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuController menuController = new MenuController();
        PelangganController pelangganController = new PelangganController();
        TransaksiController transaksiController = new TransaksiController();

        MenuView menuView = new MenuView(menuController, scanner);
        PelangganView pelangganView = new PelangganView(pelangganController, scanner);
        TransaksiView transaksiView = new TransaksiView(transaksiController, pelangganController, menuController, scanner);

        boolean running = true;
        while (running) {
            System.out.println("\n=== SISTEM KASIR KAFE ===");
            System.out.println("1. Kelola Menu");
            System.out.println("2. Kelola Pelanggan");
            System.out.println("3. Transaksi Kasir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    menuView.showMenu();
                    break;
                case "2":
                    pelangganView.showMenu();
                    break;
                case "3":
                    transaksiView.showMenu();
                    break;
                case "0":
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
        scanner.close();
    }
}