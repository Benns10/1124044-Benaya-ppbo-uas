package pbo;

import java.util.List;
import models.Menu;

public class PrintHelper {

    public static <T> void cetakSemua(List<T> items) {
        if (items.isEmpty()) {
            System.out.println("Data masih kosong.");
            return;
        }
        for (T item : items) {
            System.out.println(item.toString());
        }
    }

    public static double hitungTotalHarga(List<? extends Menu> daftarMenu) {
        double total = 0;
        for (Menu m : daftarMenu) {
            total += m.getHarga();
        }
        return total;
    }
}