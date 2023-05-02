package case_study.model;

import case_study.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String freeService) {
        super(idService, nameService, area, rentalCosts, quantity, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String writeAndReadToFile() {
        return super.getIdService() +","+ super.getNameService()+","+ super.getArea()+","+super.getRentalCosts()+","+super.getQuantity()+","+super.getRentalType()+","+
                this.freeService;
    }
}
