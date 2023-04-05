package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBai2 {
    public static int doDai(int num) {
        int cout = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cout++;
            }
        }
        return cout;
    }

    public static int[] mang(int num) {
        doDai(num);
        int dem = 0;
        int[] mang = new int[doDai(num)];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                mang[dem] = i;
                dem++;
            }
        }
        return mang;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần tìm ước :");
        int num = scanner.nextInt();
        System.out.println(Arrays.toString(mang(num)));
    }
}
