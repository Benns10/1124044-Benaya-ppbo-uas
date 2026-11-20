package pbo;

public class Kubus extends GObject3D {
    private int sisi;

    public SegiEmpat(String label, int sisi) {
        super(label);
        this.sisi = sisi;
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