package case_study.repository;

import case_study.model.*;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository {
    void addHouse(House house);

    void addVilla(Villa villa);

    void addRoom(Room room);

    Map<Facility, Integer> display();

    Map<Facility,Integer> displayValue();


}
