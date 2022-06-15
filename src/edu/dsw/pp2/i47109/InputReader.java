package edu.dsw.pp2.i47109;

import java.util.Scanner;

public class InputReader {
    private String readFromScanner() {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            return line;
        }
        input.close();
        return null;
    }

    public String getInputValue() {
        return this.readFromScanner();
    }
}
