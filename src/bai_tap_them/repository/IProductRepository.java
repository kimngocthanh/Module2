package bai_tap_them.repository;

import bai_tap_them.model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);

    List<Product> display();

    void writeProduct(String PATH);
}
