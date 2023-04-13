package ss10.bai_tap.bai_tap_them.model;

import ss10.bai_tap.bai_tap_them.model.Person;

public class Student extends Person {
    private String myClass;
    private int point;
    public Student(){}

    public Student(int id, String name, String date, boolean flag, String myClass, int point) {
        super(id, name, date, flag);
        this.myClass=myClass;
        this.point=point;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
