package pbo;

import java.util.ArrayList;
import java.util.List;
import java.models.*;

public class PrintUtil {
    public static <T> void cetakSemua(List<T> items) {
        if (items.isEmpty()) {
            System.out.println("Data masih kosong.");
            return;
        }
        for (T item : items) {
            System.out.println(item.getKeyValueDetails());
        }
    }

}