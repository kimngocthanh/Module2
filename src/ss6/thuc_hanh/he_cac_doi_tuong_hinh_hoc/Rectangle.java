package ss6.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Rectangle extends Shape{
    private double width = 1;
    private double length = 1;

    public Rectangle(){

    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length= length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    public String toString(){
        return "màu: "+color+" filled: "+filled+" diện tích = "+getArea()+ " chu vi = "+getPerimeter();
    }



}
