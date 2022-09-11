package org.example;


import static org.example.Utils.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("Hello! Please enter employee details: ");
        for (int i = 0; i < 5; i++) {
            company.employees.add(newEmployeeAdder());
        }
        while (true) {
            menu();
            switch (getNumber()) {
                case 1 -> company.getSumOfPayments();
                case 2 -> company.allEmployees();
                case 3 -> Company.employees.add(newEmployeeAdder());
                case 4 -> System.exit(0);
                default -> System.out.println("Choose number from menu list: ");
            }

        }
    }
}
