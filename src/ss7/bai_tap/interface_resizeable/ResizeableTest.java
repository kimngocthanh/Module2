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
        for (Shape shape : shapes) {
            if (shape == circle) {
                System.out.println(shape.toString());
                ((Circle) shape).resize(Math.random() * 1);
            } else if (shape == rectangle) {
                System.out.println(shape.toString());
                ((Rectangle) shape).resize(Math.random() * 1);
            } else {
                System.out.println(shape.toString());
                ((Square) shape).resize(Math.random() * 1);
            }
        }

    }
}
