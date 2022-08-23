package org.example;

public class Employee {
    private String name;
    private String surname;
    private int payment;

    public Employee(String name, String surname, int payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Salary for " + this.name + " " + this.surname + " is " + this.payment;

    }
}
