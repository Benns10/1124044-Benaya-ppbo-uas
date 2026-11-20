package pbo;

import java.util.ArrayList;
import java.util.List;
import models.Makanan;
import models.Menu;
import models.Minuman;
import repository.Repository;

public class MenuController {
    private Repository<Menu, String> menuRepo;

    public MenuController() {
        this.menuRepo = new Repository<>();
    }

    public boolean tambahMakanan(String kode, String nama, double harga, int levelPedas) {
        if (menuRepo.findById(kode) != null) return false;
        menuRepo.save(new Makanan(kode, nama, harga, levelPedas));
        return true;
    }

    public boolean tambahMinuman(String kode, String nama, double harga, boolean dingin) {
        if (menuRepo.findById(kode) != null) return false;
        menuRepo.save(new Minuman(kode, nama, harga, dingin));
        return true;
    }

    public List<Menu> getSemuaMenu() {
        return menuRepo.findAll();
    }

    public List<Makanan> getDaftarMakanan() {
        List<Makanan> hasil = new ArrayList<>();
        for (Menu m : menuRepo.findAll()) {
            if (m instanceof Makanan) {
                hasil.add((Makanan) m);
            }
        }
        return hasil;
    }

    public Menu cariMenu(String kode) {
        return menuRepo.findById(kode);
    }

    public boolean hapusMenu(String kode) {
        return menuRepo.delete(kode);
    }
}