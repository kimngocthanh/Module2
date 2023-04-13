package ss10.bai_tap.bai_tap_them.controller;

import ss10.bai_tap.bai_tap_them.service.IFuncition;
import ss10.bai_tap.bai_tap_them.service.StudentService;
import ss10.bai_tap.bai_tap_them.service.IFuncition;

import java.util.Scanner;

public class Menu  {
    IFuncition iFuncition = new StudentService();
    public void showMenu() {
        do {
            System.out.println("--Chương trình quản lý sinh viên--");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1: Thêm học sinh");
            System.out.println("2: Xóa");
            System.out.println("3: xem danh sách ");
            System.out.println("4: Thoát");
            System.out.println("chọn chức năng :");
            Scanner scanner = new Scanner(System.in);
            int check = scanner.nextInt();
            switch (check) {
                case 1:
                    iFuncition.add();
                    break;
                case 2:
                    iFuncition.display();
                    break;
                case 3:
                    iFuncition.remove();
                    break;
                case 4:
                    break;
            }
        } while (true);
    }
}
