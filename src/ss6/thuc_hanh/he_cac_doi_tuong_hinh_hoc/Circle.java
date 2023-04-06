package ss6.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1;
    private static final double PI = 3.14;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*PI;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "diện tích :"+getArea()+"chu vi :"+getPerimeter()+ "màu :"+color +" "+filled;
    }
}
