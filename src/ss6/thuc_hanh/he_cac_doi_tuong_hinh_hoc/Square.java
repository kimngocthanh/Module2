package ss6.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square (double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "diện tích:"+getArea()+"chu vi: "+getPerimeter()+ " màu sắc: "+color + " filled :"+filled;
    }
}
