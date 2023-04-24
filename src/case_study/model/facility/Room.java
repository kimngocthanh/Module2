package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String freeService) {
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
}
