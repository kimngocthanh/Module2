package bai_tap_them.service;

import bai_tap_them.model.Product;
import bai_tap_them.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    ProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        productRepository.display();
        System.out.print("nhập mã id: ");
        String id= scanner.nextLine();
        System.out.print("nhập name: ");
        String name = scanner.nextLine();
        System.out.print("nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("ghi mô tả: ");
        String describe = scanner.nextLine();
        Product product = new Product(id,name,price,describe);
        productRepository.add(product);
    }

    @Override
    public void display() {
        productRepository.display();
        for (Product p: productRepository.display()) {
            System.out.println(p);
        }
    }
}
