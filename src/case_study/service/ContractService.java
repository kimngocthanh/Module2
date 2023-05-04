package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repository.BookingRepository;
import case_study.repository.ContactRepository;

import java.util.Scanner;
import java.util.TreeSet;

public class ContractService implements IContactService {
    ContactRepository contactRepository = new ContactRepository();
    TreeSet<Contract> contractTreeSet = contactRepository.displayContact();
    Scanner scanner = new Scanner(System.in);
    BookingRepository bookingRepository = new BookingRepository();
    TreeSet<Booking> bookingTreeSet = bookingRepository.display();

    @Override
    public void displayContract() {
        contractTreeSet = contactRepository.displayContact();
        System.out.println(contractTreeSet);
    }

    @Override
    public void addContract() {
        boolean flag = false;
        System.out.print("nhập mã booking: ");
        String idBooking;
        do {
            idBooking = scanner.nextLine();
            for (Booking b : bookingTreeSet) {
                if (idBooking.equals(b.getIdBooking())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("ko có trong mã booking!");
            }
        } while (!flag);
        System.out.print("nhập số hợp đồng: ");
        int numberContract = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập số tiền cọc trước: ");
        int advanceDepositAmount = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập số tiền tổng: ");
        int totalPaymentAmount = Integer.parseInt(scanner.nextLine());

        Contract contract = new Contract(numberContract, idBooking, advanceDepositAmount, totalPaymentAmount);
        contactRepository.addContract(contract);
        System.out.println("add thành công!");
    }
}
