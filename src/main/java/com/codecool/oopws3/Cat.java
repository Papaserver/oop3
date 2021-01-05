package com.codecool.oopws3;

public class Cat extends Animal {
    public Cat(String name, boolean isMale) {
        super(name, isMale);
    }
    
    @Override
    protected void speak() {
        System.out.println("Meow");
    }
}
