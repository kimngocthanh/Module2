package ss10.bai_tap.bai_tap_them.controller;

import ss10.bai_tap.bai_tap_them.service.LecturersService;
import ss10.bai_tap.bai_tap_them.service.StudentService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    LecturersService lecturersService = new LecturersService();

    public void showMenu() {
        System.out.println("Chọn danh sách muốn thực thi ");
        System.out.println("1: Giảng viên ");
        System.out.println("2: Học viên ");
        int check = Integer.parseInt(scanner.nextLine());
        if (check == 2) {
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
                }
                if (select == 4) {
                    break;
                }
            } while (true);
        } else if (check == 1) {
            do {
                System.out.println("--Chương trình quản lý Giảng viên--");
                System.out.println("Chọn chức năng để tiếp tục");
                System.out.println("1: Thêm Giảng viên");
                System.out.println("2: Xóa");
                System.out.println("3: xem danh sách ");
                System.out.println("4: Thoát");
                System.out.println("chọn chức năng :");
                int select = scanner.nextInt();
                switch (select) {
                    case 1:
                        lecturersService.add();
                        break;
                    case 2:
                        lecturersService.remove();
                        break;
                    case 3:
                        lecturersService.display();
                        break;
                    case 4:
                        break;
                }
                if (select == 4) {
                    break;
                }
            } while (true);
        }
    }
}
