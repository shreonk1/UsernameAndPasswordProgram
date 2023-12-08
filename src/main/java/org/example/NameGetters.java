package org.example;

import java.util.Scanner;

public class NameGetters {

    public static String getFirstName(String firstName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");

        return scanner.nextLine();
    }

    public static String getSurname(String surname) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your surname");

        return scanner.nextLine();
    }
}
