package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;

import java.util.LinkedHashMap;

public class FacilityRepository implements IFacilityRepository{
    LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();


    @Override
    public void add(House house) {
        linkedHashMap.put(house,0);
    }
}
