package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public void displayCustomer(){
        CustomerService customerService = new CustomerService();
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
                    customerService.display();
                    break;
                case "2":
                    // add customer
                    customerService.addCustomer();
                    break;
                case "3":
                    // edit customer
                    customerService.editCustomer();
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
