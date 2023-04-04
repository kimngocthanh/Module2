package ss2.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số muốn kiểm tra");
        Double number = Double.parseDouble(scanner.nextLine());
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number%i==0){
                flag = false;
            }
        }if(flag){
            System.out.println(number+"là số nguyên tố");
        }else {
            System.out.println(number+"không là số nguyên tố");
        }
    }
}