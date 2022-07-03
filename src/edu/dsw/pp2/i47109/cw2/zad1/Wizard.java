package edu.dsw.pp2.i47109.cw2.zad1;

public class Wizard extends Character {
    Wizard(String name, Integer strength, Integer healthPoints) {
        super(name, strength, healthPoints);
    }

    public void castASpell(String spell) {
        System.out.println(this.getCharacterName() + " casts a spell: " + spell);
    }
}
