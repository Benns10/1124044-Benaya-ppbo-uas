package pbo;

public class Lingkaran extends GObject2D {
    private int jariJari;

    public SegiEmpat(String label, int jariJari) {
        super(label);
        this.jariJari = jariJari;
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