package bai_tap_them.common;

import bai_tap_them.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void write(String PATH, List<Product> product) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : product) {
                bufferedWriter.write(p.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> read(String PATH) {
        List<Product> productList = new ArrayList<>();
        File file = new File(PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] productArr = line.split(",");
                Product product = new Product(productArr[0], productArr[1], Double.parseDouble(productArr[2]), productArr[3]);
                productList.add(product);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
