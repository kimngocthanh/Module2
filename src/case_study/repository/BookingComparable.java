package case_study.repository;

import case_study.model.Booking;

import java.util.Comparator;

public class BookingComparable implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDayBooking().compareTo(o2.getDayBooking());
    }
}
