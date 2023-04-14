package ss10.bai_tap.bai_tap_them.repository;

import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;

public interface IFuncitionRepository<E> {
    void add(E e);

    ArrayList<E> display();

    boolean remove(int index);
}
