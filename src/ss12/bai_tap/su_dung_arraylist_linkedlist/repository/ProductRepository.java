package ss12.bai_tap.su_dung_arraylist_linkedlist.repository;

import ss12.bai_tap.su_dung_arraylist_linkedlist.model.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        Product product = new Product(1, "mỳ", 5000);
        Product product1 = new Product(2, "bánh", 9000);
        Product product2 = new Product(3, "kẹo", 7000);
        Product product3 = new Product(4, "sting", 8000);
        Product product4 = new Product(5, "coca", 2000);

        productArrayList.add(product);
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);
    }


    @Override
    public ArrayList<Product> display() {
        return productArrayList;
    }

    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    @Override
    public boolean editProduct(int index) {
        for (Product product : productArrayList) {
            if (index == product.getId()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean removeProduct(int index) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (index == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean searchProduct(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName().equals(name)) {
                System.out.println(productArrayList.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareToProductUp(Product p1, Product p2) {
        return (int) (p1.getPrice() - p2.getPrice());
    }

    @Override
    public int compareToProductDown(Product p1, Product p2) {
        return (int) (p2.getPrice() - p1.getPrice());
    }
}
