package ss6.bai_tap.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size1: ");
        double size1 = scanner.nextDouble();
        System.out.println("nhập size2: ");
        double size2 = scanner.nextDouble();
        System.out.println("nhập size3: ");
        double size3 = scanner.nextDouble();
        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());

        if((size1+size2)>size3&&(size1+size3)>size2&&(size2+size3)>size1){
            Triangle triangle1 = new Triangle(size1, size2, size3);
            System.out.println(triangle1.toString());
            Triangle triangle2 = new Triangle(size1, size2, size3, "red");
            System.out.println(triangle2.toString());
        }else {
            System.out.println("đây ko phải 3 cạnh của tam giác");
        }
    }
}
