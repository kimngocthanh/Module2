package case_study.repository;

import case_study.model.Booking;
import case_study.model.Facility;
import case_study.model.Villa;

import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> bookingTreeSet = new TreeSet<>();
    FacilityRepository facilityRepository = new FacilityRepository();

    static {
        Booking booking = new Booking("a", " 2023-05-05", "2023-05-02", "2024-06-01", "KH-0000", "HO-0000");
        Booking booking1 = new Booking("b", " 2023-05-02", "2023-05-03", "2024-06-01", "KH-0001", "HO-0001");
        Booking booking2 = new Booking("c", " 2023-05-03", "2023-05-01", "2024-07-01", "KH-0002", "VI-0000");
        Booking booking3 = new Booking("d", " 2023-05-04", "2023-05-01", "2024-06-01", "KH-0003", "VI-0001");
        bookingTreeSet.add(booking);
        bookingTreeSet.add(booking1);
        bookingTreeSet.add(booking2);
        bookingTreeSet.add(booking3);
    }

    @Override
    public TreeSet<Booking> display() {
        return bookingTreeSet;
    }

    @Override
    public void add(Booking booking) {
        bookingTreeSet.add(booking);
    }

    public void addFacilityMaintenance(Booking booking){
        facilityRepository.addBooking(booking.getIdService());
    }
}
