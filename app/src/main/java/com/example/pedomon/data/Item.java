package com.example.pedomon.data;
public class Item {

    private String name;
    private int price;
    private int happinessEffect;
    public Item(String name, int price, int happinessEffect) {
        this.name = name;
        this.price = price;
        this.happinessEffect = happinessEffect;
    }
    public void applyTo(Pet pet) {
        pet.changeHappiness(happinessEffect);
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getHappinessEffect() { return happinessEffect; }
}