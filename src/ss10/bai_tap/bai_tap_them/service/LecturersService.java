package ss10.bai_tap.bai_tap_them.service;

import ss10.bai_tap.bai_tap_them.model.Lecturers;
import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class LecturersService implements IFuncition{
    Scanner scanner = new Scanner(System.in);

    public LecturersService(){

    }

    private static ArrayList<Lecturers> lecturers = new ArrayList<>(20);

    static {
        Lecturers lecturers1 = new Lecturers(1, "Thành", "13/9/2001", "nam", 10);
        Lecturers lecturers2 = new Lecturers(2, "Thàn", "13/9/2001", "nữ", 10);
        Lecturers lecturers3 = new Lecturers(3, "Thà", "13/9/2001", "nam",10);
        Lecturers lecturers4 = new Lecturers(4, "Thnh", "13/9/2001", "nữ",  10);
        Lecturers lecturers5 = new Lecturers(5, "Tành", "13/9/2001", "nam", 10);
        lecturers.add(lecturers1);
        lecturers.add(lecturers2);
        lecturers.add(lecturers3);
        lecturers.add(lecturers4);
        lecturers.add(lecturers5);
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
        System.out.println("level");
        int level = Integer.parseInt(scanner.nextLine());
        Lecturers newLecturers = new Lecturers(id,name,date,gender,level);
        lecturers.add(newLecturers);
    }


    @Override
    public void display() {
        for (Lecturers l: lecturers) {
            System.out.print("id: "+l.getId()+" ");
            System.out.print("name: "+l.getName()+" ");
            System.out.print("ngày sinh: "+l.getDate()+" ");
            System.out.print("giới tính: "+l.getGender()+" ");
            System.out.println("level: "+ l.getLevel());
        }
    }

    @Override
    public void remove() {
        System.out.println("nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < lecturers.size(); i++) {
            if (id == lecturers.get(i).getId()) {
                flag = true;
                System.out.println("bạn có chắc muốn xóa k 1:xóa, 2 không xóa");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == 1) {
                    lecturers.remove(i);
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
