package case_study.controller;

import case_study.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    public void displayEmployee(){
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
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
                    employeeService.display();
                    break;
                case "2":
                    // add employee
                    employeeService.addEmployee();
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
    }
}
