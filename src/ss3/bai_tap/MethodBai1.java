package ss3.bai_tap;

import java.util.Scanner;

public class MethodBai1 {
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra :");
        int num = scanner.nextInt();
        System.out.println(isOdd(num));
    }
}
