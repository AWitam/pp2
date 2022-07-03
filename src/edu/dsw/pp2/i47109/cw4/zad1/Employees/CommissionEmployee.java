package edu.dsw.pp2.i47109.cw4.zad1.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class CommissionEmployee extends Employee {
    private final double baseSalary;
    private final double commission;
    private List<Sale> sales = new ArrayList<>();
    private double totalSalary = 0;
    private double earningsFromSales = 0;

    public CommissionEmployee(String firstName, String lastName, String SSN, double baseSalary, double commission) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    public void registerSale(String transaction, double value) {
        Sale sale = new Sale(transaction, value);
        sales.add(sale);
    }

    @Override
    public double calculateSalary() {
        DoubleStream saleValues = sales.stream().mapToDouble(Sale::getValue);
        this.earningsFromSales = saleValues.reduce(0, (subTotal, saleValue) -> subTotal + ( saleValue * this.commission) / 100);
        this.totalSalary = this.baseSalary / 12  + this.earningsFromSales;
        return this.totalSalary;
    }

    @Override
    public String employeeInfo() {
        return String.format("Commission employee: %s %s%n- Job title: %s%n- Base yearly salary: $%s%n- Earning from sales: $%s%n- This month salary: $%s%n",
                this.getFirstName(),
                this.getLastName(),
                this.getJobTitle(),
                this.baseSalary,
                this.earningsFromSales,
                this.totalSalary);
    }
}

