package ss2.thuc_hanh;

import java.util.Scanner;

public class UngDungChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền muốn gửi");
        double soTienGui = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập tỉ lệ lãi suất");
        double tiLeLaiSuat = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập số tháng gửi");
        int soThangGui = Integer.parseInt(scanner.nextLine());
        double soTienLai = 0;
        for (int i = 0; i < soThangGui; i++) {
            soTienLai += soTienGui*(tiLeLaiSuat/12)*soThangGui;
        }
        System.out.println(soTienLai);
    }
}
