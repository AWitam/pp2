package edu.dsw.pp2.i47109.cw2.zad1;


import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Wizard Oz = new Wizard("Oz", 7, 8);
        Dwarf dwarf = new Dwarf("Dwarf", 4, 8, new ArrayList<>());

        // base class methods
        System.out.println("Characters created \n");
        dwarf.getCharacterStatus();
        Oz.getCharacterStatus();

        System.out.println(dwarf.getCharacterName() + " attacks " + Oz.getCharacterName() + "\n");
        dwarf.attack(Oz);

        // methods specific to derrived classes
        dwarf.collectInventory("gold");
        dwarf.collectInventory("sword");
        dwarf.getInventory();
        Oz.castASpell("hokus pokus");
    }
}
