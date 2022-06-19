package edu.dsw.pp2.i47109;

import java.util.Scanner;

public class InputReader {
    private String readFromScanner() {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            return input.nextLine();
        }
        input.close();
        return null;
    }

    public String getInputValue(String message) {
        System.out.println(message);
        return this.readFromScanner();
    }
}
