package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> display();

    void addCustomer(Customer customer);

    void editCustomer(String id, Customer customer);
}
