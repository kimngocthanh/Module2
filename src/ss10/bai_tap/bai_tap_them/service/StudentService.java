package ss10.bai_tap.bai_tap_them.service;

import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;

public class StudentService extends Student implements IFuncition {
    public StudentService(){

    }

    public StudentService(int id, String name, String date, boolean flag, String myClass, int point) {
        super(id, name, date, flag, myClass, point);
    }

    private static ArrayList<Student> students = new ArrayList(20);

    static {
        Student student = new Student(1, "Thành", "13/9/2001", true, "C0223G1", 10);
        Student student1 = new Student(2, "Thàn", "13/9/2001", true, "C0223G1", 10);
        Student student2 = new Student(3, "Thà", "13/9/2001", true, "C0223G1", 10);
        Student student3 = new Student(4, "Thnh", "13/9/2001", true, "C0223G1", 10);
        Student student4 = new Student(5, "Tành", "13/9/2001", true, "C0223G1", 10);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    @Override
    public void add() {
        Student student = new Student(getId(), getName(), getDate(), isFlag(), getMyClass(), getPoint());
        students.add(student);
    }

    @Override
    public void display() {
        System.out.println(students);
    }

    @Override
    public void remove() {
        for (int i = 0; i < students.size(); i++) {
            if (i == getId()) {
                students.remove(i);
            }
        }
    }
}
