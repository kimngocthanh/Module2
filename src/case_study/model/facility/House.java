package case_study.model.facility;

import case_study.model.facility.Facility;

public class House extends Facility {
    private String roomStandardHouse;
    private int floorHouse;

    public House(){

    }

    public House(int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandardHouse, int floorHouse) {
        super(idService, nameService, area, rentalCosts, quantity, rentalType);
        this.roomStandardHouse = roomStandardHouse;
        this.floorHouse = floorHouse;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() + '\''+
                "roomStandardHouse='" + roomStandardHouse + '\'' +
                ", floorHouse=" + floorHouse +
                '}';
    }
}
