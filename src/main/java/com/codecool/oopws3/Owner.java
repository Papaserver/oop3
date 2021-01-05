package com.codecool.oopws3;

import java.util.List;

public class Owner {
    private final List<Animal> animals;
    
    public Owner(List<Animal> animals) {
        this.animals = animals;
    }
    
    public void feed() {
        animals.forEach(Animal::feed);
    }
}
