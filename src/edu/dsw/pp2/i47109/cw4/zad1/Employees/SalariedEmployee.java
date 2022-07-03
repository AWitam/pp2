package edu.dsw.pp2.i47109.cw4.zad1.Employees;

public class SalariedEmployee extends Employee {
    private final double yearlySalary;
    double bonus = 0;
    double monthSalary = 0;

    public SalariedEmployee(String firstName, String lastName, String SSN, double yearlySalary) {
        super(firstName, lastName, SSN);
        this.yearlySalary = yearlySalary;
    }

    public void setBonus(double bonusPercentage) {
        this.bonus = (bonusPercentage * this.yearlySalary / 12) / 100;
    }

    @Override
    public double calculateSalary() {
        this.monthSalary = this.yearlySalary / 12 + this.bonus;
        return this.monthSalary;
    }

    @Override
    public String employeeInfo() {
        return String.format("Salaried employee: %s %s%n- Job title: %s%n- Base yearly salary: $%s%n- Bonus: $%s%n- This month salary: $%s%n",
                this.getFirstName(),
                this.getLastName(),
                this.getJobTitle(),
                this.yearlySalary,
                this.bonus,
                this.monthSalary);
    }
}
