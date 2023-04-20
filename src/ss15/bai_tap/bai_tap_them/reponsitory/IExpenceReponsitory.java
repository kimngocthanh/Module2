package ss15.bai_tap.bai_tap_them.reponsitory;

import ss15.bai_tap.bai_tap_them.model.Expence;

import java.util.ArrayList;

public interface IExpenceReponsitory {
    ArrayList<Expence> display();

    void add(Expence expence);

    boolean edit(int id);

    boolean delete(int id);

    Expence check(int id);


}
