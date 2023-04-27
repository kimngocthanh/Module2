package case_study.repository;

import case_study.common.CommonCustomer;
import case_study.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository {
    List<Customer> customerList = new ArrayList<>();
    private static final String PATH_CUSTOMER = "src/case_study/data/customer.csv";

    @Override
    public List<Customer> display() {
        customerList = CommonCustomer.readCustomer(PATH_CUSTOMER);
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        CommonCustomer.writeCustomer(PATH_CUSTOMER, customerList);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(id, customerList.get(i).getId())) {
                customerList.set(i, customer);
            }
        }
        CommonCustomer.writeCustomer(PATH_CUSTOMER, customerList);
    }
}
