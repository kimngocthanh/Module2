package ss17.bai_tap.quan_ly_san_pham.repository;

import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    void writeProduct(String PATH);

    List<Product> display();

    void addProduct(Product product);

    boolean find(String index);
}
