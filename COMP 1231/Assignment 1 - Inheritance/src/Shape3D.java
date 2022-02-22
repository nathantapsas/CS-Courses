import java.text.DecimalFormat;

abstract class Shape3D {
    protected String name;
    protected static DecimalFormat fmt = new DecimalFormat("0.00");

    public Shape3D(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented by child classes
    public abstract double getVolume();
    public abstract double getSurfaceArea();

    // Overwrite
    @Override
    public String toString() {
        return "I am a " + this.name;
    }
}
