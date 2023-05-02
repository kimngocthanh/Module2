package case_study.model;

import java.util.Comparator;

public class Booking implements Comparable<Booking>{
    private String idBooking;
    private String dayBooking;
    private String dayStartBooking;
    private String dayEndBooking;
    private String idClient;
    private String idService;

    public Booking(){

    }

    public Booking(String idBooking, String dayBooking, String dayStartBooking, String dayEndBooking, String idClient, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.dayStartBooking = dayStartBooking;
        this.dayEndBooking = dayEndBooking;
        this.idClient = idClient;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getDayStartBooking() {
        return dayStartBooking;
    }

    public void setDayStartBooking(String dayStartBooking) {
        this.dayStartBooking = dayStartBooking;
    }

    public String getDayEndBooking() {
        return dayEndBooking;
    }

    public void setDayEndBooking(String dayEndBooking) {
        this.dayEndBooking = dayEndBooking;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", dayStartBooking='" + dayStartBooking + '\'' +
                ", dayEndBooking='" + dayEndBooking + '\'' +
                ", idClient='" + idClient + '\'' +
                ", idService='" + idService + '\'' +
                '}'+ '\n';
    }

    @Override
    public int compareTo(Booking o) {
        if(this.getDayStartBooking().equals(o.dayStartBooking)){
            return this.getDayEndBooking().compareTo(o.dayEndBooking);
        }
        return this.getDayStartBooking().compareTo(o.dayStartBooking);
    }
}
