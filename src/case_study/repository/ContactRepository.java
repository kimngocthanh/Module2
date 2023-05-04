package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.TreeSet;

public class ContactRepository implements IContactRepository {
    private static Queue<Booking> bookingQueue = new ArrayDeque<>();
    private static TreeSet<Contract> contractTreeSet = new TreeSet<>();

    static {
        Contract contract = new Contract(1, "a", 20, 30);
        Contract contract1 = new Contract(2, "b", 30, 40);
        Contract contract2 = new Contract(3, "c", 20, 30);
        Contract contract3 = new Contract(4, "d", 20, 30);
        contractTreeSet.add(contract);
        contractTreeSet.add(contract1);
        contractTreeSet.add(contract2);
        contractTreeSet.add(contract3);
    }

    @Override
    public TreeSet<Contract> displayContact() {
        return contractTreeSet;
    }

    @Override
    public void addContract(Contract contract) {
        contractTreeSet.add(contract);
    }
}
