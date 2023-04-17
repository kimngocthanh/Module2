package ss12.bai_tap.su_dung_arraylist_linkedlist.service;

import ss12.bai_tap.su_dung_arraylist_linkedlist.model.Product;
import ss12.bai_tap.su_dung_arraylist_linkedlist.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    ArrayList<Product> productArrayList = productRepository.display();

    @Override
    public void display() {
        for (Product p : productArrayList) {
            System.out.println(p);
        }
    }

    @Override
    public void add() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepository.addProduct(product);
    }

    @Override
    public void edit() {
        System.out.println("nhập id muốn sửa");
        int index = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (index == productArrayList.get(i).getId()) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("ko tìm thấy id");
        } else {
            System.out.println("nhập name: ");
            String name = scanner.nextLine();
            System.out.println("nhập giá");
            double price = Double.parseDouble(scanner.nextLine());
            productArrayList.get(index - 1).setName(name);
            productArrayList.get(index - 1).setPrice(price);
        }
    }

    @Override
    public void remove() {
        System.out.println("nhập id muốn xóa");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (index == productArrayList.get(i).getId()) {
                System.out.println("bạn có chắc xóa ko " +
                        "1. có" +
                        "2. không");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == 1) {
                    productArrayList.remove(i);
                    System.out.println("Xóa thành công");
                } else if (chose == 2) {
                    System.out.println("Không xóa");
                    break;
                }
            }
        }
    }

    @Override
    public void search() {
        System.out.println("nhập tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName().equals(name)) {
                System.out.println(productArrayList.get(i));
                flag = true;
            }
        }
        if (flag) {
            System.out.println("tìm thấy sản phẩm");
        } else {
            System.out.println("ko tìm được sản phẩm");
        }
    }

    @Override
    public void sortUp() {
        for (int i = 0; i < productArrayList.size(); i++) {
            Collections.sort(productArrayList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o1.getPrice() - o2.getPrice());
                }
            });
        }

    }

    @Override
    public void sortDown() {
        for (int i = 0; i < productArrayList.size(); i++) {
            Collections.sort(productArrayList, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return (int) (o2.getPrice() - o1.getPrice());
                }
            });
        }
    }

}
