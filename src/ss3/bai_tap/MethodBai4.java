package ss3.bai_tap;

import java.util.Scanner;

public class MethodBai4 {
    public static void fibonancci() {
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        while (num3 < 100) {
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }

    public static void main(String[] args) {
        fibonancci();
    }
}
