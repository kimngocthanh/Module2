package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository {
    void addHouse(House house);

    void addVilla(Villa villa);

    void addRoom(Room room);

    Map<Facility, Integer> display();

    Map<Facility,Integer> displayValue();
}
