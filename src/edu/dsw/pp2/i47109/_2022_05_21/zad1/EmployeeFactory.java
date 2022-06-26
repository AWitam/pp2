package edu.dsw.pp2.i47109._2022_05_21.zad1;

import edu.dsw.pp2.i47109._2022_05_21.zad1.Employees.CommissionEmployee;
import edu.dsw.pp2.i47109._2022_05_21.zad1.Employees.HourlyEmployee;
import edu.dsw.pp2.i47109._2022_05_21.zad1.Employees.SalariedEmployee;

public class EmployeeFactory {
    public HourlyEmployee createHourlyEmployee(String firstName, String lastName, String jobTitle, double hourlyRate, double hoursWorked) {
        return new HourlyEmployee(firstName, lastName, jobTitle, hourlyRate, hoursWorked);
    }

    public SalariedEmployee createSalariedEmployee(String firstName, String lastName, String jobTitle, double yearlySalary) {
        return new SalariedEmployee(firstName, lastName, jobTitle, yearlySalary);
    }

    public CommissionEmployee createCommissionedEmployee(String firstName, String lastName, String jobTitle, double baseSalary, double commission) {
        return new CommissionEmployee(firstName, lastName, jobTitle, baseSalary, commission);
    }
}
