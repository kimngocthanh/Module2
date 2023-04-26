package case_study.common;

import case_study.model.Customer;
import case_study.model.House;

import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CommonHouse {
    public static void writeHouse(String Path, List<House> houses) {
        File file = new File(Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (House h : houses) {
                bufferedWriter.write(h.writeAndReadToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<House> readHouse(String Path) {
        List<House> houseList = new ArrayList<>();
        File file = new File(Path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] houseArr = line.split(",");
                //int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandardHouse, int floorHouse
                House house = new House(Integer.parseInt(houseArr[0]), houseArr[1], Double.parseDouble(houseArr[2]), Double.parseDouble(houseArr[3]), Integer.parseInt(houseArr[4]), houseArr[5], houseArr[6], Integer.parseInt(houseArr[7]));
                houseList.add(house);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
