package com.epam.learning;

import java.util.Scanner;

public class AlternativeTask5 {

    // TODO: this class and enum Month is an alternative way on how to solve this task.
    //  It is quite similar to the example with Array of Strings that you found, but I prefer working with enums
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number from 1 to 12: ");
        String monthNumber = scanner.nextLine();
        try {
            String month = Month.getMonthName(monthNumber);
            System.out.println(month);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no month with such a number");
        }
    }
}
