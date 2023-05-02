package case_study.controller;

import case_study.service.BookingService;
import case_study.service.ContractService;

import java.util.Scanner;

public class BookingController {
    public void displayBooking(){
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        ContractService contractService = new ContractService();
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
                    bookingService.addBooking();
                    break;
                case "2":
                    //display
                    bookingService.displayBooking();
                    break;
                case "3":
                    //create new contracts
                    contractService.addContract();
                    break;
                case "4":
                    //Display list contracts
                    contractService.displayContract();
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
