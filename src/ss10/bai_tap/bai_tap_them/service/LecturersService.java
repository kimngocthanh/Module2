package ss10.bai_tap.bai_tap_them.service;

import ss10.bai_tap.bai_tap_them.model.Lecturers;
import ss10.bai_tap.bai_tap_them.repository.LecturersRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class LecturersService implements IFuncitionService {
    Scanner scanner = new Scanner(System.in);
    private LecturersRepository lecturersRepository = new LecturersRepository();
    ArrayList<Lecturers> lecturersArrayList = lecturersRepository.display();

    public LecturersService() {
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
        Lecturers newLecturers = new Lecturers(id, name, date, gender, level);
        lecturersArrayList.add(newLecturers);
    }


    @Override
    public void display() {
        for (Lecturers l : lecturersArrayList) {
            System.out.println(l);
        }
    }

    @Override
    public void remove() {
        System.out.println("nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < lecturersArrayList.size(); i++) {
            if (id == lecturersArrayList.get(i).getId()) {
                flag = true;
                System.out.println("bạn có chắc muốn xóa k 1:xóa, 2 không xóa");
                int chose = Integer.parseInt(scanner.nextLine());
                if (chose == 1) {
                    lecturersArrayList.remove(i);
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
