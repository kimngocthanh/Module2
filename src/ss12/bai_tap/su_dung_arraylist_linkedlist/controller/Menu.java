package ss12.bai_tap.su_dung_arraylist_linkedlist.controller;

import ss12.bai_tap.su_dung_arraylist_linkedlist.service.ProductService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.println("---Quản Lý Sản Phẩm---\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Xóa sản phẩm\n" +
                    "3. Hiển thị sản phẩm\n" +
                    "4. Tìm kiếm sản phẩm\n" +
                    "5. Sắp xếp theo giá trị giảm dần theo giá\n" +
                    "6. Sắp xếp theo giá trị tăng dần theo giá\n" +
                    "7. Sửa sản phẩm\n" +
                    "8. Thoát\n");
            System.out.println("nhập nhiệm vụ bạn muốn thực hiện");
            String chose = scanner.nextLine();
            switch (chose) {
                case "1":
                    productService.add();
                    break;
                case "2":
                    productService.remove();
                    break;
                case "3":
                    productService.display();
                    break;
                case "4":
                    productService.search();
                    break;
                case "5":
                    productService.sortUp();
                    break;
                case "6":
                    productService.sortDown();
                    break;
                case "7":
                    productService.edit();
                    break;
                case "8":
                    flag = false;
                    break;
                default:
                    System.out.println("Ko có trong menu");
            }
        } while (flag);
    }
}
