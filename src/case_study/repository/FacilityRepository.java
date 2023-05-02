package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        House house = new House("HO-0000", "Thuê nhà", 40, 2, 2, "Thuê theo năm", "Cao cấp", 3);
        House house1 = new House("HO-0001", "Thuê nhà", 41, 3, 3, "Thuê theo năm", "Cao cấp", 3);
        Villa villa = new Villa("VI-0000", "Thuê Villa", 40, 2, 2, "thuê theo tháng", "Cao cấp", 40, 3);
        Villa villa1 = new Villa("VI-0001", "Thuê Villa", 40, 3, 4, "thuê theo ngày", "Cao cấp", 40, 2);
        linkedHashMap.put(house, 0);
        linkedHashMap.put(house1, 5);
        linkedHashMap.put(villa, 4);
        linkedHashMap.put(villa1, 0);
    }

    @Override
    public void addHouse(House house) {
        linkedHashMap.put(house, 0);
    }

    @Override
    public void addVilla(Villa villa) {
        linkedHashMap.put(villa, 0);
    }

    @Override
    public void addRoom(Room room) {
        linkedHashMap.put(room, 0);
    }

    @Override
    public Map<Facility, Integer> display() {
        return linkedHashMap;
    }

    @Override
    public Map<Facility, Integer> displayValue() {
        return linkedHashMap;
    }

}
