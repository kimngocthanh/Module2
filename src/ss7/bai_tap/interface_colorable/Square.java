package ss7.bai_tap.interface_colorable;

public class Square extends Shape implements Colorable{
    private double size = 1;

    public Square(){

    }

    public Square(double size, String color, boolean filled){
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return size*size;
    }

    public double getPerimeter(){
        return 4*size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                " diện tích " + getArea();
    }
}
