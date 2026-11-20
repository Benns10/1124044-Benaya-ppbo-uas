package pbo;

abstract class GObject implements KeyValueDetailable {
    private String label;

    public GObject(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public void setString(String label) {
        this.label = label;
    }

    public abstract String[][] getKeyValueDetails();
}