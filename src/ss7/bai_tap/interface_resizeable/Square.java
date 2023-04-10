package ss7.bai_tap.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1;

    public Square() {

    }

    public void setSize(double size) {
        this.side = size;
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        this.side = side;
    }


    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public void resize(double percent) {
        System.out.println("diện tích hv sau khi tăng" + (getArea() + getArea() * percent));
    }

    @Override
    public String toString() {
        return "side=" + side +
                "color" + getColor() +
                "filled" + isFilled() +
                "diện tích : " + getArea();
    }
}
