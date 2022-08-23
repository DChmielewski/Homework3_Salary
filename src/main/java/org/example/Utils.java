package org.example;

import java.util.Scanner;

public class newEmployeeAdder {
    public static Employee newEmployeeAdder() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter payment: ");
        int payment = scanner.nextInt();
        scanner.nextLine();
        return new Employee(name, surname, payment);
    }


}
