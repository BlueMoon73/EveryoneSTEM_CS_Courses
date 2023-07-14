
// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Calculate area of circle
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
    }
}