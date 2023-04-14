package ss10.bai_tap.bai_tap_them.service;

import ss10.bai_tap.bai_tap_them.model.Student;
import ss10.bai_tap.bai_tap_them.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService extends Student implements IFuncitionService {
    Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();
    ArrayList<Student> studentArrayList = studentRepository.display();

    public StudentService() {
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
        studentRepository.add(student);
    }

    @Override
    public void display() {
        for (Student s : studentArrayList) {
            System.out.println(s);
        }

    }

    @Override
    public void remove() {
        this.display();
        System.out.println("nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (id == studentArrayList.get(i).getId()) {
                flag = true;
                System.out.println("bạn có chắc muốn xóa k 1:xóa, 2 không xóa");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == 1) {
                    studentArrayList.remove(i);
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
