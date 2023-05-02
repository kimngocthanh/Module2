package case_study.repository;

import case_study.model.Contract;

import java.util.TreeSet;

public interface IContactRepository {
    TreeSet<Contract> displayContact();

    void addContract(Contract contract);
}
