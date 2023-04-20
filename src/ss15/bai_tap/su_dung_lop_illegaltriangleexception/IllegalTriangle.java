package ss15.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edge1 = Double.parseDouble(scanner.nextLine());
        double edge2 = Double.parseDouble(scanner.nextLine());
        double edge3 = Double.parseDouble(scanner.nextLine());
        try {
            checkTriangle(edge1,edge2,edge3);
            System.out.print("đây là cạnh tam giác");
        } catch (IllegalTriangleException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void checkTriangle(double edge1, double edge2, double edge3) throws IllegalTriangleException {
        double edge12 = edge1 + edge2;
        double edge13 = edge1 + edge3;
        double edge23 = edge2 + edge3;
        if(edge1<0||edge2<0||edge3<0){
            throw new IllegalTriangleException("ko phải cạnh tam giác");
        }
        if (edge12<=edge3 || edge13<=edge2 || edge23<=edge1){
            throw new IllegalTriangleException("ko phải tam giác");
        }
    }


}
