public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
    // Public getter and setter methods for private variable "radius"
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implement abstract methods inherited from super class
    @Override
    public double getVolume() {
        // Volume = (4 / 3) * PI * radius^2
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        // Surface Area = 4 * PI * radius^2
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + " with radius: " + this.radius
                                + "\nSurface Area: " + fmt.format(this.getSurfaceArea())
                                + "\tVolume: " + fmt.format(this.getVolume());
    }
}
