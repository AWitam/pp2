package edu.dsw.pp2.i47109._2022_05_21.zad1.Employees;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    final protected String getFirstName() {
        return this.firstName;
    }

    final protected String getLastName() {
        return this.lastName;
    }

    final protected String getJobTitle() {
        return this.jobTitle;
    }

    public abstract double calculateSalary();

    public abstract String employeeInfo();
}
