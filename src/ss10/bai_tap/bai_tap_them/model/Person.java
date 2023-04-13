package ss10.bai_tap.bai_tap_them.model;

public abstract class Person {
    private int id;
    private String name;
    private String date;
    private boolean flag = true;

    public Person(){}

    public Person(int id , String name, String date, boolean flag){
        this.id = id;
        this.name = name;
        this.date=date;
        this.flag=flag;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
