package case_study.repository;

import case_study.model.Booking;

import java.util.TreeSet;

public interface IBookingRepository {
    TreeSet<Booking> display();

    void add(Booking booking);
}
