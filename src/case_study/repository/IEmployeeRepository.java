package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> display();

    void addEmployee(Employee employee);

    void editEmployee(String id, Employee employee);
}
