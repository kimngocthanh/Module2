package ss6.bai_tap.point_moveablepoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint.toString());

        MoveablePoint moveablePoint1 = new MoveablePoint(20, 25, 3, 5);
        System.out.println(moveablePoint1.move());

        MoveablePoint moveablePoint2 = new MoveablePoint(4, 6);
        System.out.println(moveablePoint2.move());
    }
}
