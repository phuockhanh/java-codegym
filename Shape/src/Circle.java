public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return ("A Circle with radius= " + this.radius + ", which is a subclass of " + super.toString());
    }
}
