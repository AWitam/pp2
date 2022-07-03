package edu.dsw.pp2.i47109.cw4.zad1;

import edu.dsw.pp2.i47109.cw4.zad1.Employees.Employee;

import java.util.List;

public class PayrollManager {
    private final List<Employee> employees;

    public PayrollManager(List<Employee> employees) {
        this.employees = employees;
    }

    public void calculateSalaries() {
        for (Employee employee : employees) {
            employee.calculateSalary();
        }
    }
    public void printPayReport() {
        System.out.println("--SALARIES--\n");
        for (Employee employee : employees) {
            System.out.println(employee.employeeInfo());
        }
    }
}
