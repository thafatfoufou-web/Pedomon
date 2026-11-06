package com.example.pedomon.data;
public class Treat extends Item {

    private int hungerEffect;
    public Treat(String name, int price, int happinessEffect, int hungerEffect) {
        super(name, price, happinessEffect);
        this.hungerEffect = hungerEffect;
    }
    @Override
    public void applyTo(Pet pet) {
        super.applyTo(pet);
        lowerHunger(pet);
    }
    public void lowerHunger(Pet pet) {
        pet.changeHunger(-hungerEffect);
    }
    public int getHungerEffect() { return hungerEffect; }
}