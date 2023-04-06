package ss6.bai_tap.CircleCylinder;

public class Circle {
    private double radius =1;
    private String color = "blue";

    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    
}
