package ss17.bai_tap.quan_ly_san_pham.common;

import ss17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public void writeProduct(String PATH, List<Product> productList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(PATH);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> read() {
        List<Product> productList = new ArrayList<>();
        String PATH = "src/ss17/bai_tap/quan_ly_san_pham/data/data.csv";

        FileInputStream fileInputStream = null;
        try {
            File file = new File(PATH);
            if (file.length() == 0) {
                return productList;
            } else {
                fileInputStream = new FileInputStream(PATH);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
