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
    }
}
