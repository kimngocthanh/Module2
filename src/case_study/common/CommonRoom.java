package case_study.common;

import case_study.model.House;
import case_study.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommonRoom {
    public static void writeHouse(String Path, List<Room> rooms) {
        File file = new File(Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Room r : rooms) {
                bufferedWriter.write(r.writeAndReadToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<Room> readRoom(String Path) {
        List<Room> roomList = new ArrayList<>();
        File file = new File(Path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] roomArr = line.split(",");
                //int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandardHouse, int floorHouse
                Room room = new Room(Integer.parseInt(roomArr[0]), roomArr[1], Double.parseDouble(roomArr[2]), Double.parseDouble(roomArr[3]), Integer.parseInt(roomArr[4]), roomArr[5], roomArr[6]);
                roomList.add(room);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
