package pbo;

abstract class GObject implements Identifiable<String> {
    private String label;

    public Menu(String label) {
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