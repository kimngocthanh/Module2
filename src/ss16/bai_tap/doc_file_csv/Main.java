package ss16.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Nation> readFile(String filePath){
        List<Nation> nations = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String temp;
            String[] tempArr;
            Nation nation;

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                nation = new Nation(tempArr[0],tempArr[1],tempArr[2]);
                nations.add(nation);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nations;
    }

    public static void main(String[] args) {
        List<Nation> strings = readFile("src/ss16/bai_tap/doc_file_csv/Nationn.csv");
        for (Nation a: strings) {
            System.out.println(a);
        }


    }
}
