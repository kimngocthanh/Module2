package case_study.controller;

import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityController {
    FacilityService facilityService = new FacilityService();
    public void displayFacility(){
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chức năng Facility\n" +
                    "1\tDisplay list Facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.print("chọn chức năng: ");
            String number3 = scanner.nextLine();
            switch (number3) {
                case "1":
                    //Display employee
                    facilityService.display();
                    break;
                case "2":
                    // add employee
                    boolean flag1 = true;
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
                                facilityService.addVilla();
                                break;
                            case 2:
                                //add house
                                facilityService.addHouse();
                                break;
                            case 3:
                                //add room
                                facilityService.addRoom();
                                break;
                            case 4:
                                flag1=false;
                                break;
                            default:
                                System.out.println("lệnh nhập không tồn tại!");
                                break;
                        }
                    }while (flag1);
                    break;
                case "3":
                    // edit employee
                    facilityService.displayValue();
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
