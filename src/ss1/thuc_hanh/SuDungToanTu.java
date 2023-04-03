package ss1.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        int chieuDai = scanner.nextInt();
        System.out.println("nhập chiều rộng");
        int chieuRong = scanner.nextInt();
        System.out.println("diện tích là :"+chieuDai*chieuRong);
    }
}
