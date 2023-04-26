package ss17.bai_tap.quan_ly_san_pham.repository;

import ss17.bai_tap.quan_ly_san_pham.common.Common;
import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    Common common = new Common();

    @Override
    public void writeProduct(String PATH) {
        common.writeProduct("src/ss17/bai_tap/quan_ly_san_pham/data/customer.csv", productList);
    }

    @Override
    public List<Product> display() {
        return common.read();
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        writeProduct("src/ss17/bai_tap/quan_ly_san_pham/data/customer.csv");
    }

    @Override
    public boolean find(String index) {
        for (Product product : productList) {
            return index.equals(product.getIdProduct());
        }
        return false;
    }
}
