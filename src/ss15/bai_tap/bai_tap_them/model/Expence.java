package ss15.bai_tap.bai_tap_them.model;


import java.time.LocalDate;

public class Expence {
    private int id;
    private String name;
    private LocalDate date;
    private int monney;
    private String describe;

    public Expence() {
    }

    public Expence(int id, String name, LocalDate date, int monney, String describe) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.monney = monney;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getMonney() {
        return monney;
    }

    public void setMonney(int monney) {
        this.monney = monney;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Expence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", monney=" + monney +
                ", describe='" + describe + '\'' +
                '}';
    }
}
