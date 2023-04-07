package ss6.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double hight = 1;
    private static final double PI = 3.14;

    public Cylinder() {

    }

    public Cylinder(double hight, double radius, String color) {
        super(radius, color);
        this.hight = hight;
    }

    public double getArea() {
        return 2 * PI * getRadius() * (getRadius() + hight);
    }

    public double getPerimeter() {
        return 2 * PI * getRadius() * hight;
    }

    public double getVolume() {
        return PI * getRadius() * getRadius() * hight;
    }

    public String toString() {
        return " diện tích " + getArea() + "chu vi " + getPerimeter() + "thể tích: " + getVolume() + "color " + getColor();
    }
}
