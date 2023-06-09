package case_study.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee extends Person {
    private String level;
    private String location;
    private double wage;

    public Employee() {

    }

    public Employee(String id, String name, String localDate, String gender, String cmnd, String telephone, String email, String level, String location, double wage) {
        super(id, name, localDate, gender, cmnd, telephone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() + '\'' +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage + '}';
    }

    public String writeAndReadToFile() {
        return super.getId() + "," + super.getName() + "," + super.getLocalDate()+ "," + super.getGender()+ "," + super.getCmnd() + ","+
                super.getTelephone()+ ","+ super.getEmail()+ ","+ this.level+","+this.location+","+ this.wage;
    }
}
