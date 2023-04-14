package ss10.bai_tap.bai_tap_them.repository;

import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;

public class StudentRepository implements IFuncitionRepository<Student> {
    private static ArrayList<Student> students = new ArrayList(20);

    static {
        Student student = new Student(1, "Thành", "13/9/2001", "nam", "C0223G1", 10);
        Student student1 = new Student(2, "Thàn", "13/9/2001", "nữ", "C0223G1", 10);
        Student student2 = new Student(3, "Thà", "13/9/2001", "nam", "C0223G1", 10);
        Student student3 = new Student(4, "Thnh", "13/9/2001", "nữ", "C0223G1", 10);
        Student student4 = new Student(5, "Tành", "13/9/2001", "nam", "C0223G1", 10);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }


    @Override
    public ArrayList<Student> display() {
        return students;
    }

    @Override
    public boolean remove(int index) {
        for (int i = 0; i < students.size(); i++) {
            if (index == students.get(i).getId()) {
                students.remove(i);
                return true;
            }
            return false;
        }
        return false;
    }
}
