package ss6.bai_tap.triangle;

public class Triangle extends Shape{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle(){

    }

    public Triangle(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1, double size2, double size3, String color){
        super(color);
        this.size1 =size1;
        this.size2 =size2;
        this.size3 =size3;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getPerimeter(){
        return size1+size2+size3;
    }

    public double getHalfPerimeter(){
        return (size1+size3+size2)/2;
    }

    public double getArea(){
        return Math.sqrt(getHalfPerimeter()*(getHalfPerimeter()-size1)*(getHalfPerimeter()-size2)*(getHalfPerimeter()-size3));
    }

    @Override
    public String toString() {
        return "size1=" + size1 + ", size2=" + size2 + ", size3=" + size3 + " màu :"+getColor()+ "diện tích "+getArea()+" chu vi: "+getPerimeter();
    }
}

