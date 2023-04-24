package case_study.controller;

import java.util.Scanner;

public class FuramaController {
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
                    do {
                        System.out.println("chức năng employee\n" +
                                "1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n");
                        System.out.println("chọn chức năng: ");
                        String number1 = scanner.nextLine();
                        switch (number1) {
                            case "1":
                                //Display employee
                                break;
                            case "2":
                                // add employee
                                break;
                            case "3":
                                // edit employee
                                break;
                            case "4":
                                flag = false;
                                break;
                            default:
                                System.out.print("Nhập ko đúng chức năng nhập lại: ");
                        }
                    } while (flag);
                    break;
                case "2":
                    //Customer
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
                    break;
                case "3":
                    //Facility
                    do {
                        System.out.println("chức năng Facility\n" +
                                "1\tDisplay list Facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tEdit facility\n" +
                                "4\tReturn main menu\n");
                        System.out.print("chọn chức năng: ");
                        String number3 = scanner.nextLine();
                        switch (number3) {
                            case "1":
                                //Display employee
                                break;
                            case "2":
                                // add employee
                                break;
                            case "3":
                                // edit employee
                                break;
                            case "4":
                                flag = false;
                                break;
                            default:
                                System.out.print("Nhập ko đúng chức năng nhập lại: ");
                        }
                    } while (flag);
                case "4":
                    //Booking
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
                    break;
                case "5":
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
                            default:
                                System.out.print("nhập k đúng chức năng nhập lại: ");
                        }
                    } while (flag);
                    //promotion
                case "6":
                    System.exit(6);
                default:
                    System.out.print("Nhập chức năng ko hợp lệ nhập lai: ");
            }
        } while (true);
    }
}
