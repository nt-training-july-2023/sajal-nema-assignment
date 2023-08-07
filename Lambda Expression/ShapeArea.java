@FunctionalInterface
interface Shape{
    public abstract void area();
}   

public class ShapeArea {
    public static void main(String[] args) {
        //Sqaure Area
        Shape squre = () -> {
            int side = 5;
            int squareArea = side*side;
            System.out.println("The area of Sqaure is " + squareArea);
        };
        squre.area();


        //Rectangle Area
        Shape rectangle = () -> {
            int length = 4, breadth = 5;
            int rectangleArea = length*breadth;
            System.out.println("The area of Rectangle is " + rectangleArea );
        };
        rectangle.area();


        //Circle Area
        Shape Circle = () -> {
            int radius = 7;
            double circleArea = Math.PI * radius * radius;
            System.out.println("The area of Circle is " + circleArea );
        };
        Circle.area();

        //Cube Area
        Shape Cube = () -> {
            int edge = 4;
            int cubeArea =  6 * edge * edge;
            System.out.println("The area of Cube is " + cubeArea );
        };
        Cube.area();

        //Sphere Area
        Shape sphere = () -> {
            int radius = 3;
            double sphereArea = 4 * Math.PI * radius * radius;
            System.out.println("The area of Sphere is " + sphereArea );
        };
        sphere.area();

        //Cylinder Area
        Shape cylinder = () -> {
            int height = 12 , radius = 3;
            double cylinderArea = (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
            System.out.println("The area of Cylinder is " + cylinderArea );
        };
        cylinder.area();

    }
}
