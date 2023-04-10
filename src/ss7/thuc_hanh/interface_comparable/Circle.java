package ss7.thuc_hanh.interface_comparable;

public class Circle {
    private double radius = 1.0;
    //private double radius1 = 1.0;
    private String color = "blue";
    private boolean filled = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

//    public Circle(double radius, double radius1) {
//        this.radius = radius;
//        this.radius1 = radius1;
//    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
