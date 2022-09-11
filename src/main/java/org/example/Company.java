package org.example;

import java.util.ArrayList;
import java.util.List;

public class Company {
    //private?
    static List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }
    void getSumOfPayments() {
        int summaryPayment = 0;
        for (Employee e : employees) {
            summaryPayment += e.getPayment();
        }
        System.out.println("Summary of all payments is: " + summaryPayment);
    }
    void allEmployees() {
        for (Employee myEmployee : employees) {
            System.out.println(myEmployee.toString());
        }
    }
}


