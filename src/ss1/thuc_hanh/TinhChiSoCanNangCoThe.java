package ss1.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cân nặng");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập chiều cao");
        double height = Double.parseDouble(scanner.nextLine());
        double bmi = weight/(height*height);
        if (bmi<18.5){
            System.out.println("underweight");
        }else if(bmi<25){
            System.out.println("Normal");
        }else if(bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
