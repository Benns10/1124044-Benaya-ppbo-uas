package pbo;

public class GObject3D extends GObject {
    public GObject3D(String label) {
        super(label);
    }
    public abstract double hitungLuasPermukaan();

    public abstract double hitungVolume();

    public String[][] getKeyValueDetails() {
        System.out.println("[label," + label + " ]");
    }
}