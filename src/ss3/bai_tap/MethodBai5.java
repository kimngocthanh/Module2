package ss3.bai_tap;

import java.util.Scanner;

public class MethodBai5 {
    public static boolean kiemTraSoNguyenTo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số kiểm tra nguyên tố");
        int num = scanner.nextInt();
        System.out.println(kiemTraSoNguyenTo(num));
    }

}
