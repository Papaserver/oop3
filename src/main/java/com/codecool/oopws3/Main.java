package com.codecool.oopws3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
            new Dog("Csibész", true),
            new Cat("Falánk", false)
        );
        Owner owner = new Owner(animals);
        owner.feed();
    }
}
