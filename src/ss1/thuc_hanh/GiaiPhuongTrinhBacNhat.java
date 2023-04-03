package ss1.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a:");
        double a = scanner.nextDouble();
        System.out.print("nhập b:");
        double b = scanner.nextDouble();
        System.out.print("nhập c:");
        double c = scanner.nextDouble();
        if (a==0){
            if(b==c){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            System.out.println("nghiệm của phương trình là :"+(c-b)/a);
        }
    }
}
