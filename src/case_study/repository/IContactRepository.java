package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;

import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

public interface IContactRepository {
    List<Contract> displayContact();

    void addContract(Contract contract);

    Queue<Booking> displayBooking();

    void editContract(int numberContract, Contract contract);
}
