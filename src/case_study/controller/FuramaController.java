package case_study.controller;

import java.util.Scanner;

public class FuramaController {
    EmployeeController employeeController = new EmployeeController();

    CustomerController customerController = new CustomerController();

    FacilityController facilityController = new FacilityController();

    BookingController bookingController = new BookingController();

    PromotionController promotionController = new PromotionController();
    public void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chức năng menu \n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("chọn chức năng");
            String chose = scanner.nextLine();
            switch (chose) {
                case "1":
                    //Employee Managent
                    employeeController.displayEmployee();
                    break;
                case "2":
                    //Customer
                    customerController.displayCustomer();
                    break;
                case "3":
                    //Facility
                    facilityController.displayFacility();
                    break;
                case "4":
                    //Booking
                    bookingController.displayBooking();
                    break;
                case "5":
                    //promotion
                    promotionController.displayPromotion();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.print("Nhập chức năng ko hợp lệ nhập lai: ");
            }
        } while (flag);
    }
}
