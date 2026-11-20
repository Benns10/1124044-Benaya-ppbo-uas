package pbo;

public class Balok extends GObject3D {
    private int panjang;
    private int lebar;
    private int tinggi;

    public SegiEmpat(String label, int panjang, int lebar, int tinggi) {
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
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