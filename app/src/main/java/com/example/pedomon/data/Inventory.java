package com.example.pedomon.data;

import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<Item> items;
    public Inventory() {
        this.items = new ArrayList<>();
    }
    public boolean purchaseItem(Item item, Wallet wallet) {
        int price = item.getPrice();
        boolean paid = wallet.spendCoins(price);
        if (paid) { items.add(item); }
        return paid;
    }
    public void throwItem(Item item) {
        items.remove(item);
    }
    public List<Item> getItems() {
        return items;
    }
}