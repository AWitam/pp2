package edu.dsw.pp2.i47109.cw4.zad1;

import edu.dsw.pp2.i47109.cw4.zad1.Employees.CommissionEmployee;
import edu.dsw.pp2.i47109.cw4.zad1.Employees.Employee;
import edu.dsw.pp2.i47109.cw4.zad1.Employees.HourlyEmployee;
import edu.dsw.pp2.i47109.cw4.zad1.Employees.SalariedEmployee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();
        List<Employee> employeeList = setUpPayrollList(factory);
        PayrollManager payrollManager = new PayrollManager(employeeList);

        payrollManager.calculateSalaries();


        payrollManager.printPayReport();
    }

    private static List<Employee> setUpPayrollList(EmployeeFactory factory) {
        List<Employee> employeeList = new ArrayList<>();

        HourlyEmployee hourlyEmployee1 = factory.createHourlyEmployee("Amy", "Doe", "Kitchen chef", 28, 170);
        HourlyEmployee hourlyEmployee2 = factory.createHourlyEmployee("Rachel", "Smith", "Waitress", 18, 120);

        SalariedEmployee salariedEmployee1 = factory.createSalariedEmployee("Dave", "Brown", "Accountant", 78000);
        salariedEmployee1.setBonus(5);

        CommissionEmployee commissionEmployee1 = factory.createCommissionedEmployee("John", "Kinsley", "Sales Associate", 55000, 15);
        commissionEmployee1.registerSale("Sale 1", 15000);
        commissionEmployee1.registerSale("Sale 2", 12000);

        Collections.addAll(employeeList, hourlyEmployee1, hourlyEmployee2, salariedEmployee1, commissionEmployee1);

        return employeeList;
    }
}
