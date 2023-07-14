// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Calculate area of rectangle
    @Override
    public void calculateArea() {
        double area = length * width;
        setArea(area);
    }
}