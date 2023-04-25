package bai_tap_them.repository;

import bai_tap_them.common.Common;
import bai_tap_them.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    List<Product> productList = new ArrayList<>();
    Common common = new Common();
    @Override
    public void add(Product product) {
        productList.add(product);
        writeProduct("src/bai_tap_them/data/data.csv");
    }

    @Override
    public List<Product> display() {
        return common.read("src/bai_tap_them/data/data.csv");
    }

    @Override
    public void writeProduct(String PATH) {
        //common.write("src/bai_tap_them/data/data.csv",);
    }
}
