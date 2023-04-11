package ss7.bai_tap.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(25, "blue", true);
        Rectangle rectangle = new Rectangle(20, 25, "red", true);
        Square square = new Square(15, "red", true);
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            shapes[i].resize(Math.random() * 1);
        }

    }
}
