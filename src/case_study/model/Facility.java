package case_study.model;

public abstract class Facility {
    private int idService;
    private String nameService;
    private double area;
    private double rentalCosts;
    private int quantity;
    private String rentalType;

    public Facility() {
    }

    public Facility(int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.quantity = quantity;
        this.rentalType = rentalType;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "ResortService{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", rentalCosts=" + rentalCosts +
                ", quantity=" + quantity +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
