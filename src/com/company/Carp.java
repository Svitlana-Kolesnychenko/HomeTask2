package com.company;


import java.util.ArrayList;
import java.util.List;

public class Carp<eat> extends Animal {
    static final String habitat = "water";
    static final String typeOfFood = "omnivorous";
    static final int maxWeight = 4;
    static final int livingArea = 8;
    public List<String> showPersonalInfo = showPersonalInfo();



    public Carp(String name, String dateOfBirth) {
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
