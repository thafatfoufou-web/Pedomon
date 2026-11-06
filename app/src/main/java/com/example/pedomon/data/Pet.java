package com.example.pedomon.data;
public class Pet {
    public enum State { HAPPY, SAD, HUNGRY }
    private String name;
    private int hunger;
    private int happiness;
    private int energy;
    private State state;
    public Pet(String name) {
        this.name = name;
        this.hunger = 20;
        this.happiness = 80;
        this.energy = 100;
        computeState();
    }
    public void updateStats() {
        hunger = Addlimited(hunger + 1);
        happiness = Addlimited(happiness - 1);
        computeState();
    }
    public void computeState() {
        if (hunger >= 50) { state = State.HUNGRY;
        } else if (happiness < 30) { state = State.SAD;
        } else {
            state = State.HAPPY;
        }
    }
    public void giveItem(Item item) {
        item.applyTo(this);
        computeState();
    }
    private int Addlimited(int value) {
        if (value < 0) { return 0; }
        if (value > 100) { return 100;}
        return value;
    }
    public void changeHunger(int amount) {
        hunger = Addlimited(hunger + amount);}
    public void changeHappiness(int amount) {
        happiness = Addlimited(happiness + amount);}
    public void changeEnergy(int amount) {
        energy = Addlimited(energy + amount);}
    public String getName() { return name; }
    public int getHunger() { return hunger; }
    public int getHappiness() { return happiness; }
    public int getEnergy() { return energy; }
    public State getState() { return state; }
}