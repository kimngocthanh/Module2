package ss15.bai_tap.bai_tap_them.controller;

import ss15.bai_tap.bai_tap_them.service.ExpenceService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ExpenceService expenceService = new ExpenceService();
    public void showMenu(){
        boolean flag = true;
        do {
            System.out.println("Lớp chi tiêu\n" +
                    "1. Hiển thị danh sách \n" +
                    "2. Thêm danh sách\n" +
                    "3. Sửa danh sách\n" +
                    "4. Xóa danh sách\n" +
                    "5. Tìm kiếm theo mã chi tiêu\n" +
                    "6. Tìm kiếm gần đúng theo tên chi tiêu\n" +
                    "7. Thoát");
            System.out.print("Chọn nhiệm vụ muốn thực thi: ");
            String chose = scanner.nextLine();
            switch (chose){
                case "1":
                    //hiển thị
                    expenceService.display();
                    break;
                case "2":
                    //thêm
                    expenceService.add();
                    break;
                case "3":
                    expenceService.edit();
                    break;
                case "4":
                    //xóa
                    expenceService.delete();
                    break;
                case "5":
                    //tìm kiếm theo mã
                    expenceService.check();
                    break;
                case "6":
                    // tìm kiếm theo tên
                    break;
                case "7":
                    System.exit(7);
            }
        } while (flag);
    }
}
