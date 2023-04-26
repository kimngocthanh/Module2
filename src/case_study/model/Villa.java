package case_study.model;

import case_study.model.Facility;

public class Villa extends Facility {
    private String roomStandardVilla;
    private double areaSwimmingPool;
    private int floorVilla;

    public Villa(){

    }

    public Villa(String roomStandard, double areaSwimmingPool, int floor) {
        this.roomStandardVilla = roomStandard;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floorVilla = floor;
    }

    public Villa(int idService, String nameService, double area, double rentalCosts, int quantity, String rentalType, String roomStandard, double areaSwimmingPool, int floor) {
        super(idService, nameService, area, rentalCosts, quantity, rentalType);
        this.roomStandardVilla = roomStandard;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floorVilla = floor;
    }

    public String getRoomStandard() {
        return roomStandardVilla;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandardVilla = roomStandard;
    }

    public double getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public void setAreaSwimmingPool(double areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() + '\'' +
                "roomStandard='" + roomStandardVilla + '\'' +
                ", areaSwimmingPool=" + areaSwimmingPool +
                ", floor=" + floorVilla +
                '}';
    }

    public String writeAndReadToFile(){
        return super.getIdService() +","+ super.getNameService()+","+ super.getArea()+","+super.getRentalCosts()+","+super.getQuantity()+","+super.getRentalType()+","+
                this.roomStandardVilla+","+this.areaSwimmingPool+","+this.floorVilla;
    }
}
