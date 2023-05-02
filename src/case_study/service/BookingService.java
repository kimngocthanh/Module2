package case_study.service;

import case_study.model.Booking;
import case_study.model.Customer;
import case_study.model.Facility;
import case_study.repository.BookingRepository;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;

import java.util.*;

public class BookingService implements IBookingService {
    BookingRepository bookingRepository = new BookingRepository();
    TreeSet<Booking> bookingTreeSet = bookingRepository.display();
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customerList = customerRepository.display();
    FacilityRepository facilityRepository = new FacilityRepository();
    Map<Facility, Integer> linkedHashMap = facilityRepository.display();
    Scanner scanner = new Scanner(System.in);



    @Override
    public void addBooking() {
        String idClient;
        boolean flag = false;
        do {
            System.out.print("nhập mã khách hàng muốn booking: ");
            idClient = scanner.nextLine();
            for (Customer customer : customerList) {
                if (idClient.equals(customer.getId())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("ko có mã khách hàng muốn booking!");
            }
        } while (!flag);
        String idService;
        linkedHashMap = facilityRepository.display();
        boolean flag1 = false;
        do {
            System.out.print("nhập mã dịch vụ: ");
            idService = scanner.nextLine();
            Set<Facility> set = linkedHashMap.keySet();
            for (Facility f : set) {
                if (idService.equals(f.getIdService())) {
                    flag1 = true;
                    break;
                }
            }
            if (!flag1) {
                System.out.println("ko có mã dịch vụ muốn booking! ");
            }
        } while (!flag1);
        System.out.print("nhập idbooking: ");
        String idBooking = scanner.nextLine();
        System.out.print("nhập ngày booking: ");
        String dayBooking = scanner.nextLine();
        System.out.print("nhập ngày bắt đầu booking: ");
        String dayStartBooking = scanner.nextLine();
        System.out.print("nhập ngày kết thúc booking: ");
        String dayEndBooking = scanner.nextLine();
        Booking booking = new Booking(idBooking, dayBooking, dayStartBooking, dayEndBooking, idClient, idService);
        bookingRepository.add(booking);
        System.out.println("add thành công!");
    }

    @Override
    public void displayBooking() {
        bookingTreeSet = bookingRepository.display();
        System.out.println(bookingTreeSet);
    }
}
