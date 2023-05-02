package case_study.repository;

import case_study.model.Contract;

import java.util.TreeSet;

public class ContactRepository implements IContactRepository{
    private static TreeSet<Contract> contractTreeSet= new TreeSet<>();
    static {
        Contract contract = new Contract(1,"a",20,30);
        Contract contract1 = new Contract(2,"a",30,40);
        Contract contract2= new Contract(3,"b",20,30);
        Contract contract3 = new Contract(4,"a",20,30);
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
