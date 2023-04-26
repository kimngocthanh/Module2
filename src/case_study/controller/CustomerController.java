package case_study.controller;

import java.util.Scanner;

public class CustomerController {
    public void displayCustomer(){
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chức năng customer\n" +
                    "1\tDisplay list customer\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tReturn main menu\n");
            System.out.print("chọn chức năng:");
            String number2 = scanner.nextLine();
            switch (number2) {
                case "1":
                    //Display customer
                    break;
                case "2":
                    // add customer
                    break;
                case "3":
                    // edit customer
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.print("Nhập ko đúng chức năng nhập lại: ");
            }
        } while (flag);
    }
}
