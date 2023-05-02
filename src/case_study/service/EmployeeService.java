package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.validate.EmployeeValidate;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    List<Employee> employeelist = employeeRepository.display();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        employeelist = employeeRepository.display();
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
            System.out.print("nhập id employee dạng NV-YYYY:");
            idEmployee = scanner.nextLine();
            if (!EmployeeValidate.checkidEmployee(idEmployee)) {
                System.out.println("nhập lại theo đúng dạng NV-YYYY");
            }
        } while (!EmployeeValidate.checkidEmployee(idEmployee));

        String nameEmployee;
        do {
            System.out.print("nhập name employee: ");
            nameEmployee = scanner.nextLine();
            if (!EmployeeValidate.checkNameEmployee(nameEmployee)) {
                System.out.println("nhập lại theo đúng dạng viết hoa chữ đầu trong tên:");
            }
        } while (!EmployeeValidate.checkNameEmployee(nameEmployee));

        String localDate;
        do {
            System.out.print("nhập năm sinh: ");
            localDate = scanner.nextLine();
            if (!EmployeeValidate.checkNameEmployee(localDate)) {
                System.out.println("nhập lại đúng dạng ngày tháng năm YYYY-MM-DD");
            }
        } while (!EmployeeValidate.checkOld(localDate));

        System.out.print("1. Nam \n" +
                "2. Nu \n" +
                "Chon gioi tinh: ");
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
            if (!EmployeeValidate.checkCmndEmployee(cmnd)) {
                System.out.println("nhập lại cmnd 9 số hoặc 12 số:");
            }
        } while (!EmployeeValidate.checkCmndEmployee(cmnd));

        String telephone;
        do {
            System.out.print("nhập số điện thoại: ");
            telephone = scanner.nextLine();
            if (!EmployeeValidate.checkTelephoneEmployee(telephone)) {
                System.out.println("nhập số điện thoại bắt đầu từ 0 và đủ 10 số");
            }
        } while (!EmployeeValidate.checkTelephoneEmployee(telephone));

        System.out.print("nhập email: ");
        String email = scanner.nextLine();

        System.out.println("chọn trình độ \n" +
                "1. Trung cấp\n" +
                "2. Cao đăng\n" +
                "3. Đại học\n" +
                "4. Sau đại học");
        String level = null;
        System.out.print("chọn trình độ: ");
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
                    break;
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
        System.out.print("chọn vị trí: ");
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
            if (wage < 0) {
                System.out.println("nhập lương lớn hơn 0.");
            }
        } while (wage < 0);

        Employee employee = new Employee(idEmployee, nameEmployee, localDate, gender, cmnd, telephone, email, level, location, wage);
        employeeRepository.addEmployee(employee);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void editEmployee() {
        System.out.print("nhập idEmployee muốn sửa: ");
        String id = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < employeelist.size(); i++) {
            if (Objects.equals(id, employeelist.get(i).getId())) {
                do {
                    System.out.println("chọn trường bạn muốn edit\n" +
                            "1. edit idEmployee\n" +
                            "2. edit nameEmployee\n" +
                            "3. edit ngày sinh\n" +
                            "4. edit gender\n" +
                            "5. edit cmnd\n" +
                            "6. edit telephone\n" +
                            "7. edit email\n" +
                            "8. edit level\n" +
                            "9. edit location\n" +
                            "10. edit wage\n" +
                            "11. thoát edit" +
                            "chọn trường bạn muốn edit: ");
                    int chose = Integer.parseInt(scanner.nextLine());
                    switch (chose) {
                        case 1:
                            String idEmployee;
                            do {
                                System.out.print("nhập id employee dạng NV-YYYY:");
                                idEmployee = scanner.nextLine();
                                if (!EmployeeValidate.checkidEmployee(idEmployee)) {
                                    System.out.println("nhập lại theo đúng dạng NV-YYYY");
                                }
                            } while (!EmployeeValidate.checkidEmployee(idEmployee));
                            Employee employee = new Employee(idEmployee, employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 2:
                            String nameEmployee;
                            do {
                                System.out.print("nhập name employee: ");
                                nameEmployee = scanner.nextLine();
                                if (!EmployeeValidate.checkNameEmployee(nameEmployee)) {
                                    System.out.println("nhập lại theo đúng dạng viết hoa chữ đầu trong tên:");
                                }
                            } while (!EmployeeValidate.checkNameEmployee(nameEmployee));
                            employee = new Employee(employeelist.get(i).getId(), nameEmployee, employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 3:
                            String localDate;
                            do {
                                System.out.print("nhập năm sinh: ");
                                localDate = scanner.nextLine();
                                if (!EmployeeValidate.checkNameEmployee(localDate)) {
                                    System.out.println("nhập lại đúng dạng ngày tháng năm YYYY-MM-DD");
                                }
                            } while (!EmployeeValidate.checkOld(localDate));
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), localDate, employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 4:
                            System.out.print(
                                    "1. Nam \n" +
                                    "2. Nu \n" +
                                    "Chon gioi tinh: ");
                            String gender = null;
                            String chooseGender = scanner.nextLine();
                            if (chooseGender.equals("1")) {
                                gender = "nam";
                            } else if (chooseGender.equals("2")) {
                                gender = "nữ";
                            }
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), gender, employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 5:
                            String cmnd;
                            do {
                                System.out.print("nhập chứng minh nhân dân: ");
                                cmnd = scanner.nextLine();
                                if (!EmployeeValidate.checkCmndEmployee(cmnd)) {
                                    System.out.println("nhập lại cmnd 9 số hoặc 12 số:");
                                }
                            } while (!EmployeeValidate.checkCmndEmployee(cmnd));
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), cmnd,
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 6:
                            String telephone;
                            do {
                                System.out.print("nhập số điện thoại: ");
                                telephone = scanner.nextLine();
                                if (!EmployeeValidate.checkTelephoneEmployee(telephone)) {
                                    System.out.println("nhập số điện thoại bắt đầu từ 0 và đủ 10 số");
                                }
                            } while (!EmployeeValidate.checkTelephoneEmployee(telephone));
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    telephone, employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 7:
                            System.out.print("nhập email: ");
                            String email = scanner.nextLine();
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), email, employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 8:
                            System.out.println("chọn trình độ \n" +
                                    "1. Trung cấp\n" +
                                    "2. Cao đăng\n" +
                                    "3. Đại học\n" +
                                    "4. Sau đại học");
                            String level = null;
                            System.out.println("chọn trình độ: ");
                            String chosee = scanner.nextLine();
                            boolean flag1 = true;
                            do {
                                switch (chosee) {
                                    case "1":
                                        level = "Trung cấp";
                                        flag1 = false;
                                        break;
                                    case "2":
                                        level = "Cao đẳng";
                                        flag1 = false;
                                        break;
                                    case "3":
                                        level = "Đại học";
                                        flag1 = false;
                                        break;
                                    case "4":
                                        level = "Sau đại học";
                                        flag1 = false;
                                        break;
                                    default:
                                        System.out.println("nhập ko hợp lệ");
                                }
                            } while (flag1);
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), level, employeelist.get(i).getLocation(), employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 9:
                            System.out.println("chọn vị trí:\n" +
                                    "1. Lễ tân\n" +
                                    "2. Phục vụ\n" +
                                    "3. Chuyên viên\n" +
                                    "4. Giám sát\n" +
                                    "5. Quản lý\n" +
                                    "6. Giám đốc");
                            String location = null;
                            System.out.print("chọn vị trí: ");
                            int choseLocation = Integer.parseInt(scanner.nextLine());
                            boolean flag2 = true;
                            do {
                                switch (choseLocation) {
                                    case 1:
                                        location = "lễ tân";
                                        flag2 = false;
                                        break;
                                    case 2:
                                        location = "phục vụ";
                                        flag2 = false;
                                        break;
                                    case 3:
                                        location = "chuyên viên";
                                        flag2 = false;
                                        break;
                                    case 4:
                                        location = "Giám sát";
                                        flag2 = false;
                                        break;
                                    case 5:
                                        location = "Quản lý";
                                        flag2 = false;
                                        break;
                                    case 6:
                                        location = "Giám đốc";
                                        flag2 = false;
                                        break;
                                    default:
                                        System.out.println("nhập ko hợp lệ");
                                }
                            } while (flag2);
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), location, employeelist.get(i).getWage());
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 10:
                            double wage;
                            do {
                                System.out.print("nhập lương: ");
                                wage = Double.parseDouble(scanner.nextLine());
                                if (wage < 0) {
                                    System.out.println("nhập lương lớn hơn 0");
                                }
                            } while (wage < 0);
                            employee = new Employee(employeelist.get(i).getId(), employeelist.get(i).getName(), employeelist.get(i).getLocalDate(), employeelist.get(i).getGender(), employeelist.get(i).getCmnd(),
                                    employeelist.get(i).getTelephone(), employeelist.get(i).getEmail(), employeelist.get(i).getLevel(), employeelist.get(i).getLocation(), wage);
                            employeeRepository.editEmployee(id, employee);
                            break;
                        case 11:
                            flag = false;
                            break;
                        default:
                            System.out.println("nhập ko phù hợp: ");
                    }
                } while (flag);
                System.out.println("edit thành công!");
            }
        }
    }
}
