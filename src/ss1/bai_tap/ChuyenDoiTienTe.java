package ss1.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        Double usd = Double.parseDouble(scanner.nextLine());
        int rate = 23000;
        System.out.println("số tiền Việt sau khi chuyển là : " +usd*rate);
    }
}
