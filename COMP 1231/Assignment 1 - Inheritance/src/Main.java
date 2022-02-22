import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape3D[] shapes = {
                            new Cube(3),
                            new Sphere(4),
                            new Cylinder(2, 5)
                            };

        Arrays.stream(shapes)
                .forEach(i -> System.out.println(i.toString() + "\n"));

    }
}


// Consider a three-dimensional (3-D) geometric shape as a concept. Any such 3-D shape will have a volume and surface area,
// but until you know the nature of the shape and its attribute dimensions, these will be abstract in nature.
//
//Design and implement an inheritance hierarchy starting with a 3-D shape, then a set of at least three derived classes
// that define regular 3-D shapes such as a cube, sphere, cylinder, and so on. Include with your submission a UML class
// diagram showing the design.
//Any general 3-D shape will have a name, but few other attributes. For each derived shape, store fundamental attribute
// data about its dimensions, and provide methods to access and modify this data. In addition, provide appropriate methods
// to compute each shape’s volume and surface area. For example, a cube has a volume of s3 where s is the length of a
// side, whereas a sphere has a volume of 4πr3/3 where r is the radius. In terms of style, every class should have
// constructors and a toString() method that properly uses inheritance.
//
//Create a driver class with an array reference for 3-D shapes, and instantiate several shapes of different types and
// dimensions to exercise the behaviour you provided.