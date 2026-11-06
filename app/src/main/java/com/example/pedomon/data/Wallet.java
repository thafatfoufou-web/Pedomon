package com.example.pedomon.data;

public class Wallet {
    private int pawCoins;
    public Wallet() {
        this.pawCoins = 0;
    }
    public void addCoins(int amount) {
        pawCoins = pawCoins + amount;
    }
    public boolean spendCoins(int amount) {
        if (amount > pawCoins) {
            return false;
        }
        pawCoins = pawCoins - amount;
        return true;
    }
    public int getBalance() {
        return pawCoins;
    }
}
