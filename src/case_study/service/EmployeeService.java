package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.validate.EmployeeValidate;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Employee> employeelist = employeeRepository.display();
        for (Employee e : employeelist) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        //String id, String name, LocalTime localTime, String gender, String cmnd, String telephone,
        // String email, String level, String location, double wage
        employeeRepository.display();

        String idEmployee;
        do {
            System.out.print("nhập id employee :");
            idEmployee = scanner.nextLine();
        } while (!EmployeeValidate.checkidEmployee(idEmployee));

        String nameEmployee;
        do {
            System.out.print("nhập name employee: ");
            nameEmployee = scanner.nextLine();
        } while (!EmployeeValidate.checkNameEmployee(nameEmployee));

        int day;
        int month;
        int year;
        LocalDate localDate;
        do {
            System.out.print("nhập ngày sinh: ");
            day = Integer.parseInt(scanner.nextLine());
            System.out.print("nhập tháng sinh: ");
            month = Integer.parseInt(scanner.nextLine());
            System.out.print("nhập năm sinh: ");
            year = Integer.parseInt(scanner.nextLine());
            localDate = LocalDate.of(year, month, day);
        } while ((LocalDate.now().getYear() - year) < 0
                || ((LocalDate.now().getYear() - year == 0)) && ((LocalDate.now().getMonthValue() - month) < 0)
                || (LocalDate.now().getYear() - year == 0) && (LocalDate.now().getMonthValue() - month == 0) && (LocalDate.now().getDayOfMonth() - day <= 0));

        System.out.println("Chon gioi tinh \n" +
                "1. Nam \n" +
                "2. Nu \n");
        String gender = null;
        String chooseGender = scanner.nextLine();
        if (chooseGender.equals("1")) {
            gender = "nam";
        } else if (chooseGender.equals("2")) {
            gender = "nữ";
        }

        String cmnd;
        do {
            System.out.print("nhập chứng minh nhân dân: ");
            cmnd = scanner.nextLine();
        } while (!EmployeeValidate.checkCmndEmployee(cmnd));

        String telephone;
        do {
            System.out.print("nhập số điện thoại: ");
            telephone = scanner.nextLine();
        } while (!EmployeeValidate.checkTelephoneEmployee(telephone));

        System.out.print("nhập email: ");
        String email = scanner.nextLine();

        System.out.println("chọn trình độ \n" +
                "1. Trung cấp\n" +
                "2. Cao đăng\n" +
                "3. Đại học\n" +
                "4. Sau đại học");
        String level = null;
        System.out.println("chọn trình độ: ");
        String chose = scanner.nextLine();
        boolean flag = true;
        do {
            switch (chose) {
                case "1":
                    level = "Trung cấp";
                    flag = false;
                    break;
                case "2":
                    level = "Cao đẳng";
                    flag = false;
                    break;
                case "3":
                    level = "Đại học";
                    flag = false;
                    break;
                case "4":
                    level = "Sau đại học";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
            }
        } while (flag);

        System.out.println("chọn vị trí:\n" +
                "1. Lễ tân\n" +
                "2. Phục vụ\n" +
                "3. Chuyên viên\n" +
                "4. Giám sát\n" +
                "5. Quản lý\n" +
                "6. Giám đốc");
        String location = null;
        System.out.println("chọn vị trí");
        int choseLocation = Integer.parseInt(scanner.nextLine());
        do {
            switch (choseLocation) {
                case 1:
                    location = "lễ tân";
                    flag = false;
                    break;
                case 2:
                    location = "phục vụ";
                    flag = false;
                    break;
                case 3:
                    location = "chuyên viên";
                    flag = false;
                    break;
                case 4:
                    location = "Giám sát";
                    flag = false;
                    break;
                case 5:
                    location = "Quản lý";
                    flag = false;
                    break;
                case 6:
                    location = "Giám đốc";
                    flag = false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
            }
        } while (flag);

        double wage;
        do {
            System.out.print("nhập lương: ");
            wage = Double.parseDouble(scanner.nextLine());
        } while (wage < 0);

        Employee employee = new Employee(idEmployee, nameEmployee, localDate, gender, cmnd, telephone, email, level, location, wage);
        employeeRepository.addEmployee(employee);
    }
}
