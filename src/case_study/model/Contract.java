package case_study.model;

public class Contract implements Comparable<Contract> {
    private int numberContract;
    private String idBooking;
    private int advanceDepositAmount;
    private int totalPaymentAmount;

    public Contract() {

    }

    public Contract(int numberContract, String idBooking, int advanceDepositAmount, int totalPaymentAmount) {
        this.numberContract = numberContract;
        this.idBooking = idBooking;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(int advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", idBooking='" + idBooking + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Contract o) {
        return this.getIdBooking().compareTo(o.getIdBooking());
    }
}
