package bai_tap_them.repository;

import bai_tap_them.common.Common;
import bai_tap_them.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> productList = new ArrayList<>();
    private static final String PATH = "src/bai_tap_them/data/customer.csv";
    @Override
    public void add(Product product) {
        productList.add(product);
        Common.write(PATH, productList);
    }

    @Override
    public List<Product> display() {
        productList= Common.read(PATH);
        return productList;
    }


}
