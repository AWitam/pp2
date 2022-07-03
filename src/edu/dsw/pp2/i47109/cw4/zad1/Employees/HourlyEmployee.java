package edu.dsw.pp2.i47109.cw4.zad1.Employees;

public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private double hoursWorked;
    private double salary = 0;


    public HourlyEmployee(String firstName, String lastName, String jobTitle, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, jobTitle);
        this.hourlyRate = hourlyRate;
        setHoursWorked(hoursWorked);
    }

    @Override
    public double calculateSalary() {
        this.salary = this.hourlyRate * this.hoursWorked;
        return this.salary;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Hours worked must be grater than 0");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String employeeInfo() {
        return String.format("Hourly employee: %s %s%n- Job title: %s%n- Hourly rate: $%s Hours worked: %s %n- This month salary: $%s%n",
                this.getFirstName(),
                this.getLastName(),
                this.getJobTitle(),
                this.hourlyRate,
                this.hoursWorked,
                this.salary);
    }
}
