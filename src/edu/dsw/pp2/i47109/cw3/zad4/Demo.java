package edu.dsw.pp2.i47109.cw3.zad4;

/**
 * Zad 4 - testy jednostkowe sortowania i odwracania kolejnosci obiektow
 */

public class Demo {
    static public void main(String args[]) {
        Player[] players = new Player[] {
                new Player("PlayerOne", 1200),
                new Player("PlayerTwo", 400),
                new Player("PlayerFour", 800)
        };

        Sorter sorter = new Sorter();
        sorter.sort(players);
        sorter.reverse(players);
    }
}
