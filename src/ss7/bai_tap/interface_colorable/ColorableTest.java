package ss7.bai_tap.interface_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(10, "red", true);
        Rectangle rectangle = new Rectangle(10,20,"black",false);
        Square square = new Square(20,"blue",true);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (Shape shape : shapes) {
            if (shape == square) {
                System.out.println(shape.toString());
                ((Square) shape).howToColor();
            } else {
                System.out.println(shape.toString());
            }
        }
    }
}
