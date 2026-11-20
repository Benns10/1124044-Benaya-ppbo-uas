package pbo;

public class GObject2D extends GObject {
    public GObject2D(String label) {
        super(label);
    }
    public abstract double hitungLuas();

    public abstract double hitungKeliling();

    @Override 
    public String[][] getKeyValueDetails() {
        System.out.println("[label," + label + " ]");
    }
}