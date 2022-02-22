public class Cylinder extends Shape3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getSurfaceArea() {
        // Surface Area = (2 * PI * radius * height) + (2 * PI * radius^2)
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double getVolume() {
        // Volume = PI * radius^2 * height
        return Math.PI * Math.pow(this.radius, 2) * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + " with radius: " + this.radius + " and height: " + this.height
                                + "\nSurface Area: " + fmt.format(this.getSurfaceArea())
                                + "\t\tVolume: " + fmt.format(this.getVolume());
    }
}
