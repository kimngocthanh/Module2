package ss17.bai_tap.quan_ly_san_pham.service;

import ss17.bai_tap.quan_ly_san_pham.model.Product;
import ss17.bai_tap.quan_ly_san_pham.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    ProductRepository productRepository = new ProductRepository();
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        productList= productRepository.display();
        for (Product p: productList) {
            System.out.println(p);
        }
    }

    @Override
    public void addProduct() {
        System.out.print("nhập mã id: ");
        String id= scanner.nextLine();
        System.out.print("nhập name: ");
        String name = scanner.nextLine();
        System.out.print("nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("nhập hãng: ");
        String manufacturedGoods = scanner.nextLine();
        System.out.print("ghi mô tả: ");
        String describe = scanner.nextLine();
        Product product = new Product(id,name,price,manufacturedGoods,describe);
        productRepository.addProduct(product);
    }

    @Override
    public void find() {
        String id  = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if(id.equals(productList.get(i).getIdProduct())){
                System.out.println(productList.get(i));
            }
        }
    }
}
