// Shape class
class Shape {
    private String color;
    private double area;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Calculate area method (to be overridden by subclasses)
    public void calculateArea() {
        // Implementation in subclasses
    }

    // Display shape information
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }
}