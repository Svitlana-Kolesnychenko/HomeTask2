package com.company;

import java.util.List;

public abstract class Animal {
    private List<String> animalShowPersonalInfo;
    private String animalName;
    private String animalDateOfBirth;


    public Animal(String name, String dateOfBirth) {
        this.animalName = name;
        this.animalDateOfBirth = dateOfBirth;
        this.animalShowPersonalInfo = showPersonalInfo();
    }

    public String getName() {
        return animalName;
    }

    public String getDateOfBirth() {
        return animalDateOfBirth;
    }

    public abstract List<String> showPersonalInfo();
}

