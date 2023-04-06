package ss4.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;

//    public Rectangle() {
//    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("width : ");
        double width = scanner.nextInt();
        System.out.print("height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

