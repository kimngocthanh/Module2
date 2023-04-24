package ss17.bai_tap.quan_ly_san_pham.controller;

import ss17.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class MenuController {
    ProductService productService = new ProductService();
    public void menuController(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Quản Lý Sản Phẩm\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển Thị Sản Phẩm\n" +
                    "3. Tìm Kiếm Sản Phẩm\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng: ");
            String chose = scanner.nextLine();
            switch (chose){
                case "1":
                    //thêm
                    productService.addProduct();
                    break;
                case "2":
                    //hiển thị
                    productService.display();
                    break;
                case "3":
                    //tìm kiếm
                    productService.find();
                    break;
                case "4":
                    flag=false;
                    break;
                default:
                    System.out.println("nhập chức năng ko hợp lệ");
            }
        }while (flag);
    }
}
