package org.example;


import java.util.List;
import java.util.Scanner;

public class Utils {
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

    public static void menu() {
        System.out.println("1 - Print sum of all employees salary ");
        System.out.println("2 - Display all employees data ");
        System.out.println("3 - Add new employee ");
        System.out.println("4 - End program ");
    }





    public static int getNumber() {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }


}

