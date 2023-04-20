package ss15.bai_tap.bai_tap_them.service;

import ss15.bai_tap.bai_tap_them.model.Expence;
import ss15.bai_tap.bai_tap_them.reponsitory.ExpenceReponsitory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpenceService implements IExpenceService {
    Scanner scanner = new Scanner(System.in);
    ExpenceReponsitory expenceReponsitory = new ExpenceReponsitory();
    ArrayList<Expence> expenceArrayList = expenceReponsitory.display();

    @Override
    public void display() {
        for (Expence e : expenceArrayList) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.print("nhập mã chi tiêu: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập tên chi tiêu: ");
        String name = scanner.nextLine();
        System.out.print("nhập năm chi tiêu");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập tháng chi tiêu");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập ngày chi tiêu");
        int day = Integer.parseInt(scanner.nextLine());
        LocalDate date = LocalDate.of(year,month,day);
        System.out.print("nhập số tiền chi tiêu: ");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập mô tả thêm: ");
        String describe = scanner.nextLine();
        Expence expence = new Expence(id, name, date, money, describe);
        expenceArrayList.add(expence);
    }

    @Override
    public String edit() {
        System.out.println("nhập id muốn đổi");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < expenceArrayList.size(); i++) {
            if(id== expenceArrayList.get(i).getId()){
                System.out.println("nhập tên chi tiêu muốn đổi");
                String name = scanner.nextLine();
                System.out.print("nhập năm chi tiêu");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập tháng chi tiêu");
                int month = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập ngày chi tiêu");
                int day = Integer.parseInt(scanner.nextLine());
                LocalDate date = LocalDate.of(year,month,day);
                System.out.print("nhập số tiền chi tiêu: ");
                int money = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập mô tả thêm: ");
                String describe = scanner.nextLine();
                expenceArrayList.get(i).setName(name);
                expenceArrayList.get(i).setDate(date);
                expenceArrayList.get(i).setMonney(money);
                expenceArrayList.get(i).setDescribe(describe);
            }
            else {
                return "ko có id muốn sửa";
            }
        }
        return "id ko phù hợp";
    }

    @Override
    public void delete() {
        System.out.println("nhập id bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < expenceArrayList.size(); i++) {
            if(id== expenceArrayList.get(i).getId()){
                expenceArrayList.remove(i);
            }
        }
    }

    @Override
    public void check() {
        System.out.println("nhập id muốn check thông tin");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < expenceArrayList.size(); i++) {
            if(id== expenceArrayList.get(i).getId()){
                System.out.println(expenceArrayList.get(i));
            }
        }
    }
}
