package ss10.bai_tap.bai_tap_them.repository;

import ss10.bai_tap.bai_tap_them.model.Lecturers;
import ss10.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;

public class LecturersRepository implements IFuncitionRepository<Lecturers> {
    private static ArrayList<Lecturers> lecturers = new ArrayList<>(20);

    static {
        Lecturers lecturers1 = new Lecturers(1, "Thành", "13/9/2001", "nam", 10);
        Lecturers lecturers2 = new Lecturers(2, "Thàn", "13/9/2001", "nữ", 10);
        Lecturers lecturers3 = new Lecturers(3, "Thà", "13/9/2001", "nam", 10);
        Lecturers lecturers4 = new Lecturers(4, "Thnh", "13/9/2001", "nữ", 10);
        Lecturers lecturers5 = new Lecturers(5, "Tành", "13/9/2001", "nam", 10);
        lecturers.add(lecturers1);
        lecturers.add(lecturers2);
        lecturers.add(lecturers3);
        lecturers.add(lecturers4);
        lecturers.add(lecturers5);
    }

    @Override
    public void add(Lecturers lecturer) {
        lecturers.add(lecturer);
    }

    @Override
    public ArrayList<Lecturers> display() {
        return lecturers;
    }

    @Override
    public boolean remove(int index) {
        for (int i = 0; i < lecturers.size(); i++) {
            if (index == lecturers.get(i).getId()) {
                lecturers.remove(i);
                return true;
            }
            return false;
        }
        return false;
    }
}
