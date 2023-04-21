package ss15.bai_tap.bai_tap_them.reponsitory;

import ss15.bai_tap.bai_tap_them.model.Expence;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExpenceReponsitory implements IExpenceReponsitory{
    private static ArrayList<Expence> expences = new ArrayList<>();

    static {
        Expence expence1 = new Expence(1, "Gạo Thái", LocalDate.of(2023, 4, 20), 5000, "Ngon rẻ");
        Expence expence2 = new Expence(2, "Gạo Nhật", LocalDate.of(2023, 4, 20), 15000, "Ngon bổ rẻ");
        Expence expence3 = new Expence(3, "Gạo Hàn", LocalDate.of(2023, 4, 20), 55000, "Ngon bổ không rẻ");
        Expence expence4 = new Expence(4, "Gạo Việt", LocalDate.of(2023, 4, 20), 105000, "Ngon bổ rẻ hàng việt");
        Expence expence5 = new Expence(5, "Gạo Mỹ", LocalDate.of(2023, 4, 20), 35000, "Ngon bổ rẻ tầm trung");

        expences.add(expence1);
        expences.add(expence2);
        expences.add(expence3);
        expences.add(expence4);
        expences.add(expence5);
    }


    @Override
    public ArrayList<Expence> display() {
        return expences;
    }

    @Override
    public void add(Expence expence) {
        expences.add(expence);
    }

    @Override
    public boolean edit(int id) {
        for (int i = 0; i < expences.size(); i++) {
            if(id== expences.get(i).getId()){
                return true;
            }return false;
        }return false;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < expences.size(); i++) {
            if(id == expences.get(i).getId()){
                return true;
            }return false;
        }return false;
    }

    @Override
    public Expence check(int id) {
        for (int i = 0; i < expences.size(); i++) {
            if(id== expences.get(i).getId()){
                return expences.get(i);
            }
        }return null;
    }

}
