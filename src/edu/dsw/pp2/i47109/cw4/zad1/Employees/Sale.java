package edu.dsw.pp2.i47109.cw4.zad1.Employees;

public class Sale {
    private final double value;

    public Sale(String transaction, double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
