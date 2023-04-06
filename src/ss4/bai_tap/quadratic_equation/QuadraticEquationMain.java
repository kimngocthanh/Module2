package ss4.bai_tap.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a :");
        double a = scanner.nextDouble();
        System.out.print("nhập b :");
        double b = scanner.nextDouble();
        System.out.print("nhập c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDenta() < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (quadraticEquation.getDenta() == 0) {
            System.out.println("phương trình có 1 nghiệm duy nhất :" + quadraticEquation.getRoot());
        } else {
            System.out.println("nghiệm thứ nhất :" + quadraticEquation.getRoot1());
            System.out.println("nghiệm thứ hai :" + quadraticEquation.getRoot2());
        }
    }
}
