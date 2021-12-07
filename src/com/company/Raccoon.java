package com.company;


import java.util.ArrayList;
import java.util.List;

public class Raccoon extends Animal {
    static final String habitat = "land";
    static final String typeOfFood = "meat";
    static final int maxWeight = 9;
    static final int livingArea = 50;
    public List<String> showPersonalInfo = showPersonalInfo();

    public Raccoon(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
    @Override
    public List<String> showPersonalInfo() {
        List <String> showPersonalInfo = new ArrayList<>();
        showPersonalInfo.add(0,getName());
        showPersonalInfo.add(1,getDateOfBirth());
        showPersonalInfo.add(2, habitat);
        showPersonalInfo.add(3, typeOfFood);
        showPersonalInfo.add(4, (Integer.toString(maxWeight)));
        showPersonalInfo.add(5, (Integer.toString(livingArea)));
        return showPersonalInfo;
    }
}
