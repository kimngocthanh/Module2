package case_study.service;


import case_study.model.Contract;
import case_study.repository.ContactRepository;

import java.util.*;

public class ContractService implements IContactService {
    ContactRepository contactRepository = new ContactRepository();
    List<Contract> contractQueue = contactRepository.displayContact();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayContract() {
        contractQueue = contactRepository.displayContact();
        System.out.println(contractQueue);
    }

    @Override
    public void addContract() {
        contractQueue = contactRepository.displayContact();
        if (Objects.requireNonNull(contactRepository.displayBooking().peek()).getIdService().contains("RO")) {
            System.out.println("không tạo hợp đồng cho Room!");
            contactRepository.displayBooking().remove();
        } else {
            System.out.print("nhập số hợp đồng: ");
            int numberContract = Integer.parseInt(scanner.nextLine());
            System.out.print("nhập số tiền cọc trước: ");
            int advanceDepositAmount = Integer.parseInt(scanner.nextLine());
            System.out.print("nhập số tiền tổng: ");
            int totalPaymentAmount = Integer.parseInt(scanner.nextLine());
            Contract contract = new Contract(numberContract, Objects.requireNonNull(contactRepository.displayBooking().poll()).getIdBooking(), advanceDepositAmount, totalPaymentAmount);
            contactRepository.addContract(contract);
            System.out.println("add thành công!");
        }
    }

    @Override
    public void editContract() {
        System.out.print("nhập số hợp đồng muốn edit: ");
        int numberContract = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (int i = 0; i < contractQueue.size(); i++) {
            if(numberContract==contractQueue.get(i).getNumberContract()){
                do {
                    System.out.print("1. nhập số tiền cọc muốn sửa\n" +
                            "2. nhập số tiền tổng muốn sửa\n" +
                            "3. thoát" +
                            "nhập trường muốn sửa: ");
                    int chose = Integer.parseInt(scanner.nextLine());
                    switch (chose){
                        case 1:
                            System.out.print("nhập số tiền cọc trước: ");
                            int advanceDepositAmount = Integer.parseInt(scanner.nextLine());
                            Contract contract = new Contract(contractQueue.get(i).getNumberContract(),contractQueue.get(i).getIdBooking(),advanceDepositAmount,contractQueue.get(i).getTotalPaymentAmount());
                            contactRepository.editContract(numberContract,contract);
                            break;
                        case 2:
                            System.out.print("nhập tiền tổng: ");
                            int totalPaymentAmount = Integer.parseInt(scanner.nextLine());
                            contract = new Contract(contractQueue.get(i).getNumberContract(),contractQueue.get(i).getIdBooking(),contractQueue.get(i).getAdvanceDepositAmount(),totalPaymentAmount);
                            contactRepository.editContract(numberContract,contract);
                        case 3:
                            flag = false;
                            break;
                    }
                }while (flag);
            }
        }

    }
}

