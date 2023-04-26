package case_study.common;

import case_study.model.House;
import case_study.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommonVilla {
    public static void writeVilla(String Path, List<Villa> villas) {
        File file = new File(Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa v : villas) {
                bufferedWriter.write(v.writeAndReadToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<Villa> readVilla(String Path) {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(Path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] villaArr = line.split(",");
                //int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandardHouse, int floorHouse
                Villa villa = new Villa(Integer.parseInt(villaArr[0]), villaArr[1], Double.parseDouble(villaArr[2]), Double.parseDouble(villaArr[3]), Integer.parseInt(villaArr[4]), villaArr[5], villaArr[6], Double.parseDouble(villaArr[7]), Integer.parseInt(villaArr[8]));
                villaList.add(villa);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
