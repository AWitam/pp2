package edu.dsw.pp2.i47109;

public class Main {
    static public void main(String args[]) {
        // zad 1 - dzialania na wielkich liczbach
        BigIntCalculator bigIntCalculator = new BigIntCalculator();
        bigIntCalculator.exec();

        // zad 2 - kopiowanie plikow
        FileCopier fileCopier = new FileCopier();
        fileCopier.makeCopy();

        // zad 3 zamiana delimetrow na spacje
        FileParser fileParser = new FileParser();
        fileParser.removeDelimiters();

        // zad 4 - testy jednostkowe sortowania i odwracania kolejnosci obiektow
        Player[] players = new Player[]{new Player("PlayerOne", 1200), new Player("PlayerTwo", 400), new Player("PlayerFour", 800)};

        Sorter sorter = new Sorter();
        sorter.sort(players);
        sorter.reverse(players);

    }
}
