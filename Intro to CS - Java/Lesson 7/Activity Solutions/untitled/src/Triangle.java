// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // Calculate area of triangle
    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        setArea(area);
    }
}