package ss12.bai_tap.su_dung_arraylist_linkedlist.repository;

import ss12.bai_tap.su_dung_arraylist_linkedlist.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> display();

    void addProduct(Product product);

    boolean editProduct(int index);

    boolean removeProduct(int index);

    boolean searchProduct(String name);

    int compareToProductUp(Product p1, Product p2);

    int compareToProductDown(Product p1, Product p2);
}
