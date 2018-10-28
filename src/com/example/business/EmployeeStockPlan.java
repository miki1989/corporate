package com.example.business;

import com.example.data.Admin;
import com.example.data.Director;
import com.example.data.Employee;
import com.example.data.Manager;

public class EmployeeStockPlan {
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;
    private final int adminShares = 90;

    public EmployeeStockPlan(){
    }

    public int grantStock(Employee employee){
        if (employee instanceof Director){
            return directorShares;
        }
        else if (employee instanceof Manager){
            return managerShares;
        }
        else if (employee instanceof Admin){
            return adminShares;
        }
        else {
            return employeeShares;
        }
    }

}
