package pbo;

import java.util.List;
import model.Transaksi;
import repository.Repository;

public class TransaksiController {
    private Repository<Transaksi, String> transaksiRepo;

    public TransaksiController() {
        this.transaksiRepo = new Repository<>();
    }

    public boolean simpanTransaksi(Transaksi transaksi) {
        if (transaksiRepo.findById(transaksi.getId()) != null) return false;
        transaksiRepo.save(transaksi);
        return true;
    }

    public List<Transaksi> getSemuaTransaksi() {
        return transaksiRepo.findAll();
    }
}