package edu.dsw.pp2.i47109;

import java.io.*;
import java.util.stream.Stream;

public class FileParser {
    private void parseFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Stream<String> lines = br.lines();
            lines.forEach(this::removeAndPrintDelimeters);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeAndPrintDelimeters(String line) {
        line = line.replaceAll("[,:|.-]", " ");
        line = line.replaceAll("\\s{2,}", " ").trim(); // removes extra whitespace
        System.out.println(line);
    }

    public void removeDelimiters() {
        String path = new InputReader().getInputValue("Type path to a file which you wish to remove delimiters from >>" + "\nExample path: ./files/delimiters.txt");
        this.parseFile(path);
    }

}
