package ss10.bai_tap.bai_tap_them.controller;

import ss10.bai_tap.bai_tap_them.service.IFuncition;
import ss10.bai_tap.bai_tap_them.service.StudentService;
import ss10.bai_tap.bai_tap_them.service.IFuncition;

import java.util.Scanner;

public class Menu  {
    StudentService studentService = new StudentService();
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("--Chương trình quản lý sinh viên--");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1: Thêm học sinh");
            System.out.println("2: Xóa");
            System.out.println("3: xem danh sách ");
            System.out.println("4: Thoát");
            System.out.println("chọn chức năng :");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.remove();
                    break;
                case 3:
                    studentService.display();
                    break;
                case 4:
                    break;
            }if(select==4){
                break;
            }
        } while (true);
    }
}
