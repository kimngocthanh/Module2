package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.validate.CustomerValidate;
import case_study.validate.EmployeeValidate;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customerList = customerRepository.display();
    @Override
    public void display() {
        customerList = customerRepository.display();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        customerRepository.display();
        String idCustomer;
        do {
            System.out.print("nhập id customer :");
            idCustomer = scanner.nextLine();
        } while (!CustomerValidate.checkidCustomer(idCustomer));

        String nameCustomer;
        do {
            System.out.print("nhập name customer: ");
            nameCustomer = scanner.nextLine();
        } while (!CustomerValidate.checkNameCustomer(nameCustomer));


        String localDate;
        do {
            System.out.print("nhập năm sinh: ");
            localDate = scanner.nextLine();
        } while (!CustomerValidate.checkOld(localDate));

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
        } while (!CustomerValidate.checkCmndCustomer(cmnd));

        String telephone;
        do {
            System.out.print("nhập số điện thoại: ");
            telephone = scanner.nextLine();
        } while (!CustomerValidate.checkTelephoneCustomer(telephone));

        System.out.print("nhập email: ");
        String email = scanner.nextLine();

        System.out.println("chọn loại khách \n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        String customerType = null;
        System.out.println("chọn loại khách: ");
        String chose = scanner.nextLine();
        boolean flag = true;
        do {
            switch (chose) {
                case "1":
                    customerType = "Diamond";
                    flag = false;
                    break;
                case "2":
                    customerType = "Platinum";
                    flag = false;
                    break;
                case "3":
                    customerType = "Gold";
                    flag = false;
                    break;
                case "4":
                    customerType = "Silver";
                    flag = false;
                    break;
                case "5":
                    customerType = "Member";
                    flag=false;
                    break;
                default:
                    System.out.println("nhập ko hợp lệ");
            }
        } while (flag);


        System.out.println("nhập địa chỉ: ");
        String adress = scanner.nextLine();

        Customer customer = new Customer(idCustomer, nameCustomer, localDate, gender, cmnd, telephone, email, customerType, adress);
        customerRepository.addCustomer(customer);
        System.out.println("Thêm mới thành công!");
    }

    @Override
    public void editCustomer() {
        System.out.print("nhập idEmployee muốn sửa: ");
        String id = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(id, customerList.get(i).getId())) {
                do {
                    System.out.println("chọn trường bạn muốn edit\n" +
                            "1. edit idEmployee\n" +
                            "2. edit nameEmployee\n" +
                            "3. edit ngày sinh\n" +
                            "4. edit gender\n" +
                            "5. edit cmnd\n" +
                            "6. edit telephone\n" +
                            "7. edit email\n" +
                            "8. edit customerType\n" +
                            "9. edit adress\n" +
                            "10. thoát"+
                            "chọn trường bạn muốn edit: ");
                    int chose = Integer.parseInt(scanner.nextLine());
                    switch (chose) {
                        case 1:
                            String idCustomer;
                            do {
                                System.out.print("nhập id employee :");
                                idCustomer = scanner.nextLine();
                            } while (!CustomerValidate.checkidCustomer(idCustomer));
                            Customer customer = new Customer(idCustomer, customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 2:
                            String nameCustomer;
                            do {
                                System.out.print("nhập name employee: ");
                                nameCustomer = scanner.nextLine();
                            } while (!EmployeeValidate.checkNameEmployee(nameCustomer));
                            customer = new Customer(customerList.get(i).getId(), nameCustomer, customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 3:
                            String localDate;
                            do {
                                System.out.print("nhập năm sinh: ");
                                localDate = scanner.nextLine();

                            } while (!EmployeeValidate.checkOld(localDate));
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), localDate, customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 4:
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
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), gender, customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 5:
                            String cmnd;
                            do {
                                System.out.print("nhập chứng minh nhân dân: ");
                                cmnd = scanner.nextLine();
                            } while (!EmployeeValidate.checkCmndEmployee(cmnd));
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), cmnd,
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 6:
                            String telephone;
                            do {
                                System.out.print("nhập số điện thoại: ");
                                telephone = scanner.nextLine();
                            } while (!EmployeeValidate.checkTelephoneEmployee(telephone));
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    telephone, customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 7:
                            System.out.print("nhập email: ");
                            String email = scanner.nextLine();
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), email, customerList.get(i).getCustomerType(), customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 8:
                            System.out.println("chọn loại khách \n" +
                                    "1. Diamond\n" +
                                    "2. Platinum\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member");
                            String customerType = null;
                            System.out.println("chọn loại khách: ");
                            String chosee = scanner.nextLine();
                            boolean flag1 = true;
                            do {
                                switch (chosee) {
                                    case "1":
                                        customerType = "Diamond";
                                        flag1 = false;
                                        break;
                                    case "2":
                                        customerType = "Platinum";
                                        flag1 = false;
                                        break;
                                    case "3":
                                        customerType = "Gold";
                                        flag1 = false;
                                        break;
                                    case "4":
                                        customerType = "Silver";
                                        flag1 = false;
                                        break;
                                    case "5":
                                        customerType = "Member";
                                        flag1=false;
                                        break;
                                    default:
                                        System.out.println("nhập ko hợp lệ");
                                }
                            } while (flag1);
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerType, customerList.get(i).getAdress());
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 9:
                            System.out.println("nhập địa chỉ: ");
                            String adress = scanner.nextLine();
                            customer = new Customer(customerList.get(i).getId(), customerList.get(i).getName(), customerList.get(i).getLocalDate(), customerList.get(i).getGender(), customerList.get(i).getCmnd(),
                                    customerList.get(i).getTelephone(), customerList.get(i).getEmail(), customerList.get(i).getCustomerType(), adress);
                            customerRepository.editCustomer(id, customer);
                            break;
                        case 10:
                            flag=false;
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
