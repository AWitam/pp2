package edu.dsw.pp2.i47109.cw3.zad4;

public class Player implements Comparable<Player> {
    private String name;
    private int rankingPoints;

    public Player(String name, int rankingPoints) {
        this.name = name;
        this.rankingPoints = rankingPoints;
    }

    @Override
    public int compareTo(Player player) {
        return this.rankingPoints - player.rankingPoints;
    }

    @Override
    public String toString() {
        return "{" + "name: '" + name + ", " + "rankingPoints: " + rankingPoints + "}";
    }
}
