package ss10.bai_tap.bai_tap_them.service;

import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService extends Student implements IFuncition {
    Scanner scanner = new Scanner(System.in);

    public StudentService() {
    }

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

    public StudentService(int id, String name, String date, String gender, String myClass, int point) {
        super(id, name, date, gender, myClass, point);
    }

    @Override
    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập ngày tháng sinh");
        String date = scanner.nextLine();
        System.out.println("giới tính");
        String gender = scanner.nextLine();
        System.out.println("Lớp");
        String myClass = scanner.nextLine();
        System.out.println("Điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, date, gender, myClass, point);
        students.add(student);
    }

    @Override
    public void display() {
        for (Student s : students) {
            System.out.print("id: " + s.getId() + " ");
            System.out.print("name: " + s.getName() + " ");
            System.out.print("Giới tính: " + s.getGender() + " ");
            System.out.print("ngày sinh:" + s.getDate() + " ");
            System.out.print("Lớp: " + s.getMyClass() + " ");
            System.out.println("Điểm: " + s.getPoint() + " ");

        }

    }

    @Override
    public void remove() {
        System.out.println("nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                flag = true;
                System.out.println("bạn có chắc muốn xóa k ");
                System.out.println("1: xóa ");
                System.out.println("2: không ");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == 1) {
                    students.remove(i);
                } else {
                    break;
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("ko có id muốn xóa");
        }
    }
}
