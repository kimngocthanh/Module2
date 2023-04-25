package bai_tap_them.controller;

import bai_tap_them.service.ProductService;

import java.util.Scanner;

public class MenuController {
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        boolean flag =true;
        do{
            System.out.println("Quản lý sản phẩm\n" +
                    "1. thêm sản phẩm\n" +
                    "2. hiển thị\n" +
                    "3. tìm kiếm\n" +
                    "4. thoát\n" +
                    "chọn chức năng: ");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    //thêm
                    productService.add();
                    break;
                case 2:
                    //hiển thị
                    productService.display();
                    break;
                case 3:
                    // tìm kiếm
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("nhập chức năng ko hợp lệ");

            }
        }while (flag);
    }
}
