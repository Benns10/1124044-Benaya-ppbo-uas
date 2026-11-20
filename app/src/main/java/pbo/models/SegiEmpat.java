package pbo;

public class SegiEmpat extends GObject2D {
    private int panjang;
    private int lebar;

    public SegiEmpat(String label, int panjang, int lebar) {
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
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