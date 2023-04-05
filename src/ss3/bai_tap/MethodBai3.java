package ss3.bai_tap;

import java.util.Scanner;

public class MethodBai3 {
    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm muốn kiểm tra :");
        int year = scanner.nextInt();
        System.out.println(isLeap(year));
    }
}
