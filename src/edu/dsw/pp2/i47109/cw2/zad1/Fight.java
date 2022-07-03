package edu.dsw.pp2.i47109.cw2.zad1;

public class Fight {
    Character attacker;
    Character opponent;

    Fight(Character attacker, Character opponent) {
        this.attacker = attacker;
        this.opponent = opponent;
    }

    public void startFight() {
        if (attacker.getCharacterStrength() > opponent.getCharacterStrength()) {
            this.opponent.setHealthPoints(-1);
            System.out.println(attacker.getCharacterName() + " has won the fight! Opponent loses 1 health point.");
        }
        this.attacker.setHealthPoints(-1);
        System.out.println(opponent.getCharacterName() + " has won the fight! Opponent loses 1 health point.");
    }
}
