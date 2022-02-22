public class Cube extends Shape3D{
    private double length;

    // Constructor calls super with its name, "Cube", as the parameter and also sets the side length.
    public Cube(double length) {
        super("Cube");
        this.length = length;
    }

    // Public getter and setter methods for private variable "length"
    public double getSideLength() {
        return this.length;
    }

    public void setSideLength(double length) {
        this.length = length;
    }

    // Implement abstract methods inherited from super class
    @Override
    public double getVolume() {
        // Volume = length^3
        return Math.pow(this.length, 3);
    }

    @Override
    public double getSurfaceArea() {
        // Surface Area = 6 * length * length
        return 6 * Math.pow(this.length, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " with length: " + this.length
                                + "\nSuface Area: " + fmt.format(this.getSurfaceArea())
                                + "\t\tVolume: " + fmt.format(this.getVolume());
    }
}
