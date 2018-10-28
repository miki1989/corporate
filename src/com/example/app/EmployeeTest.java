package com.example.app;

import com.example.business.EmployeeStockPlan;
import com.example.data.*;

public class EmployeeTest {
    public static void main(String[] args) {

        Engineer engineer = new Engineer(101, "Jan Kowalski", "0131931", 2000);

        Manager manager = new Manager(201, "Wąski Jestem", "23232", 5000, "Marketing");

        Admin admin = new Admin(22, "Ryba Śmiga", "423232", 3500);

        Director director = new Director(22, "Ferdynand Lipski", "11111", 6000, "Przywództwo", 150000);

        EmployeeStockPlan employeeStockPlan = new EmployeeStockPlan();
        printEmployee(engineer, employeeStockPlan);
        printEmployee(admin, employeeStockPlan);
        printEmployee(manager, employeeStockPlan);
        printEmployee(director, employeeStockPlan);

        System.out.println("\nTesting raiseSalary and setName on Manager");
        manager.setName("Jurek Kiler");
        manager.raiseSalary(400);
        printEmployee(manager,employeeStockPlan);
    }

    public static void printEmployee(Employee employee){
        System.out.println();
        System.out.println("Employee type " + employee.getClass().getSimpleName());
        System.out.println(employee);
    }

    public static void printEmployee(Employee employee, EmployeeStockPlan employeeStockPlan){
        printEmployee(employee);
        System.out.println("Stock options " + employeeStockPlan.grantStock(employee));
    }
}
