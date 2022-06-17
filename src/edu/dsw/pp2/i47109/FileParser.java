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

    private String getFilePath() {
        System.out.println("Type path to a file which you wish to remove delimeters from >>");
        System.out.println("Example path: ./files/delimeters.txt");
        return new InputReader().getInputValue();
    }

    public void removeDelimeter() {
        String path = this.getFilePath();
        this.parseFile(path);
    }

}
