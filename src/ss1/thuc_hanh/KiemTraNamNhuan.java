package ss1.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm muốn kiểm tra :");
        int month = scanner.nextInt();
        if ((month%4==0&&month%100!=0)||(month%400==0)){
            System.out.println(month+" là năm nhuận");
        }else {
            System.out.println(month+" ko là năm nhuận");
        }
    }
}
