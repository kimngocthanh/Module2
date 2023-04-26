package case_study.repository;

import case_study.common.CommonEmpoyee;
import case_study.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    List<Employee> employeeList = new ArrayList<>();
    private static final String PATH_EMPLOYEE = "src/case_study/data/employee.csv";
    @Override
    public List<Employee> display() {
        employeeList = CommonEmpoyee.readEmployee(PATH_EMPLOYEE);
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        CommonEmpoyee.writeEmployee(PATH_EMPLOYEE, employeeList);
    }
}
