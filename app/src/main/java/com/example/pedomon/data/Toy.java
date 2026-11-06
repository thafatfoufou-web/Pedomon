package com.example.pedomon.data;
public class Toy extends Item {
    private int energyEffect;
    public Toy(String name, int price, int happinessEffect, int energyEffect) {
        super(name, price, happinessEffect);
        this.energyEffect = energyEffect;
    }
    @Override
    public void applyTo(Pet pet) {
        super.applyTo(pet);
        lowerEnergy(pet);
    }
    public void lowerEnergy(Pet pet) {
        pet.changeEnergy(-energyEffect);
    }
    public int getEnergyEffect() { return energyEffect; }
}