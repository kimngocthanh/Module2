package ss5.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính :");
        double radius = scanner.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
