package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    public void displayFacility(){
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
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
    }
}
