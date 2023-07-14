// Main program
public class Main {
    public static void main(String[] args) {
        // Create instances of shapes
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 6.0, 4.0);
        Triangle triangle = new Triangle("Green", 3.0, 7.0);

        // Calculate areas
        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();

        // Display shape information
        circle.displayInfo();
        rectangle.displayInfo();
        triangle.displayInfo();
    }
}