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
                    do {
                        System.out.println("chọn loại dịch vụ muốn thêm mới\n" +
                                "1. add villa\n" +
                                "2. add house\n" +
                                "3. add room\n" +
                                "4. back to menu");
                        int chose = Integer.parseInt(scanner.nextLine());
                        switch (chose){
                            case 1:
                                //add villa
                                break;
                            case 2:
                                //add house
                                break;
                            case 3:
                                //add room
                                break;
                            case 4:
                                flag=false;
                                break;
                            default:
                                System.out.println("lệnh nhập không tồn tại!");
                                break;
                        }
                    }while (flag);
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
