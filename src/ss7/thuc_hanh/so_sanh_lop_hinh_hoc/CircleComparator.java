package ss7.thuc_hanh.so_sanh_lop_hinh_hoc;

import ss7.thuc_hanh.interface_comparable.Circle;
import ss7.thuc_hanh.interface_comparable.ComparableCircle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

}
