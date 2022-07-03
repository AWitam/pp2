package edu.dsw.pp2.i47109.cw2.zad1;

public abstract class Character {
    private final String name;
    private final Integer strength;
    private Integer healthPoints;

    Character(String name, Integer strength, Integer healthPoints) {
        this.name = name;
        this.strength = strength;
        this.healthPoints = healthPoints;
    }

    public Integer getCharacterStrength() {
        return this.strength;
    }

    public String getCharacterName() {
        return this.name;
    }

    public void getCharacterStatus() {
        String stats = String.format("Character %s status: \n Strength: %s \n Health points: %s \n", this.name, this.strength, this.healthPoints);
        System.out.println(stats);
    }

    public void setHealthPoints(Integer value) {
        this.healthPoints += value;
    }

    public void attack(Character opponent) {
        Fight fight = new Fight(this, opponent);
        fight.startFight();
    }
}
