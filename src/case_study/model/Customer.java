package case_study.model;

import java.time.LocalTime;

public class Customer extends Person {
    private String customerType;
    private String adress;

    public Customer() {

    }

    public Customer(String id, String name, LocalTime localTime, String gender, String cmnd, String telephone, String email, String customerType, String adress) {
        super(id, name, localTime, gender, cmnd, telephone, email);
        this.customerType = customerType;
        this.adress = adress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() + '\'' +
                "customerType='" + customerType + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
