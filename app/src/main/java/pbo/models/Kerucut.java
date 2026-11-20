package pbo;

public class Balok extends GObject3D {
    private int jariJari;
    private int tinggi;

    public SegiEmpat(String label, int jariJari, int tinggi) {
        super(label);
        this.jariJari = jariJari;
        this. panjang = panjang;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 10;
    }

    @Override
    public double hitungVolume() {
        return 10;
    }    
}