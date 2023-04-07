package ss6.bai_tap.circle_cylinder;

public class Circle {
    private double radius =1;
    private String color = "blue";
    private static final double PI = 3.14;

    public Circle(){

    }

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

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return PI*2*radius;
    }

    @Override
    public String toString() {
        return "màu sắc :"+color +" diện tích :"+ getArea()+ " chu vi :"+getPerimeter();
    }
}
