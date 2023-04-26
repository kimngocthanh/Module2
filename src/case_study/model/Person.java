package case_study.model;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Person {
    private String id;
    private String name;
    private LocalDate localDate;
    private String gender;
    private String cmnd;
    private String telephone;
    private String email;

    public Person(){

    }

    public Person(String id, String name, LocalDate localDate, String gender, String cmnd, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.localDate = localDate;
        this.gender = gender;
        this.cmnd = cmnd;
        this.telephone = telephone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", localTime=" + localDate +
                ", gender='" + gender + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
