package pbo;

import java.util.List;
import models.Pelanggan;
import repository.Repository;

public class PelangganController {
    private Repository<Pelanggan, String> pelangganRepo;

    public PelangganController() {
        this.pelangganRepo = new Repository<>();
    }

    public boolean tambahPelanggan(String id, String nama, String noHp) {
        if (pelangganRepo.findById(id) != null) return false;
        pelangganRepo.save(new Pelanggan(id, nama, noHp));
        return true;
    }

    public List<Pelanggan> getSemuaPelanggan() {
        return pelangganRepo.findAll();
    }

    public Pelanggan cariPelanggan(String id) {
        return pelangganRepo.findById(id);
    }

    public boolean hapusPelanggan(String id) {
        return pelangganRepo.delete(id);
    }
}