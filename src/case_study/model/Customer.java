package case_study.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Customer extends Person {
    private String customerType;
    private String adress;

    public Customer() {

    }

    public Customer(String id, String name, LocalDate localDate, String gender, String cmnd, String telephone, String email, String customerType, String adress) {
        super(id, name, localDate, gender, cmnd, telephone, email);
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

    public String writeAndReadToFile() {
        return super.getId() + "," + super.getName() + "," + super.getLocalDate() + "," + super.getGender()+ "," + super.getCmnd() + "," + super.getTelephone()+ "," + super.getEmail() +","+
                this.customerType+ "," + this.adress;
    }
}
