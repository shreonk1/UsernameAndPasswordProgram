package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        makeUsername();
        PasswordGenerator passwordGenerator = new PasswordGeneratorBuilder()
                .useLower(true)
                .useUpper(true)
                .useDigits(true)
                .usePunctuation(true)
                .build();           

        String password = passwordGenerator.generate(8);
        System.out.println("Your password is: " + password);

    }

    public static void makeUsername() {
        String firstName = NameGetters.getFirstName("");
        String surname = NameGetters.getSurname("");

        String newFirstName = StringUtils.left(firstName, 3);
        String newSurname = StringUtils.right(surname, 2);

        System.out.println("Your username is: " + newFirstName + newSurname);
    }


}