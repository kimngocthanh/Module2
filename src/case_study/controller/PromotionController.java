package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public void displayPromotion(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chức năng promotion management\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.print("chọn chức năng: ");
            String number5 = scanner.nextLine();
            switch (number5) {
                case "1":
                    //display list customers use service
                    break;
                case "2":
                    //display list customers get voucher
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.print("nhập k đúng chức năng nhập lại: ");
            }
        } while (flag);
    }
}
