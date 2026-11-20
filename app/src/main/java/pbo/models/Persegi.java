package pbo;

public class Persegi extends GObject2D {
    private int sisi

    public SegiEmpat(String label, int sisi) {
        super(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 10;
    }

    @Override
    public double hitungKeliling() {
        return 10;
    }
}