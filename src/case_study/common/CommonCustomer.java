package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CommonCustomer {
    public static void writeCustomer(String Path, List<Customer> customers) {
        File file = new File(Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customers) {
                bufferedWriter.write(c.writeAndReadToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<Customer> readCustomer(String Path) {
        List<Customer> customersList = new ArrayList<>();
        File file = new File(Path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] customerArr = line.split(",");
                //String id, String name, LocalTime localTime, String gender, String cmnd, String telephone, String email, String customerType, String adress
                Customer customer = new Customer(customerArr[0], customerArr[1], LocalDate.parse(customerArr[2]), customerArr[3], customerArr[4], customerArr[5], customerArr[6], customerArr[7], customerArr[8] );
                customersList.add(customer);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customersList;
    }

}
