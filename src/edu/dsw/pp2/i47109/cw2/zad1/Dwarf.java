package edu.dsw.pp2.i47109.cw2.zad1;

import java.util.ArrayList;

public class Dwarf extends Character {
    private ArrayList<String> inventory;

    Dwarf(String name, Integer strength, Integer healthPoints, ArrayList<String> inventory) {
        super(name, strength, healthPoints);
        this.inventory = inventory;
    }

    public void collectInventory(String item) {
        inventory.add(item);
    }

    public void getInventory() {
        String inventoryInfo = String.format("Items in %s's inventory: %s", this.getCharacterName(), this.inventory);
        System.out.println(inventoryInfo);
    }
}
