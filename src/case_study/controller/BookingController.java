package case_study.controller;

import java.util.Scanner;

public class BookingController {
    public void displayBooking(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chức năng booking\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.print("chọn chức năng: ");
            String number4 = scanner.nextLine();
            switch (number4) {
                case "1":
                    //add booking
                    break;
                case "2":
                    //display
                    break;
                case "3":
                    //create new contracts
                    break;
                case "4":
                    //Display list contracts
                    break;
                case "5":
                    //edit contracts
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.print("Nhập k đúng chức năng nhập lại");
            }
        } while (flag);
    }
}
