package edu.dsw.pp2.i47109.cw3.zad3;

import edu.dsw.pp2.i47109.cw3.helpers.InputReader;

import java.io.*;
import java.util.stream.Stream;

/**
 *
 * Zamienia wystapienia delimitrow: " ,:|.- " na spacje ze wskazanego w linii polecen pliku tesktowego i wyswietla
 * tak zmodyfikowane linie tesktu.
 * Przykladowy plik tekstowy z ww znakami znajduje sie w './files/delimiters.txt'
 */

public class FileParser {
    private void parseFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Stream<String> lines = br.lines();
            lines.forEach(this::removeAndPrintDelimiters);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeAndPrintDelimiters(String line) {
        line = line.replaceAll("[,:|.-]", " ");
        line = line.replaceAll("\\s{2,}", " ").trim(); // removes extra whitespace
        System.out.println(line);
    }

    public void removeDelimiters() {
        String path = new InputReader().getInputValue("Type path to a file which you wish to remove delimiters from >>" + "\nExample path: ./files/delimiters.txt");
        this.parseFile(path);
    }

}
