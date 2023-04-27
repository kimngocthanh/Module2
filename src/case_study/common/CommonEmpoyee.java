package case_study.common;

import case_study.model.Customer;
import case_study.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CommonEmpoyee {
    public static void writeEmployee(String Path, List<Employee> employees) {
        File file = new File(Path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employees) {
                bufferedWriter.write(e.writeAndReadToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static List<Employee> readEmployee(String Path) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(Path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] employeeArr = line.split(",");
                //String id, String name, LocalTime localTime, String gender, String cmnd, String telephone, String email, String level, String location, double wage
                Employee employee = new Employee(employeeArr[0], employeeArr[1], employeeArr[2], employeeArr[3], employeeArr[4], employeeArr[5], employeeArr[6], employeeArr[7], employeeArr[8], Double.parseDouble(employeeArr[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }


}
