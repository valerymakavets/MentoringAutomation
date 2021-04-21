package com.epam.learning;

import java.util.Scanner;

public class Task5 {

    // TODO: 1 - main method should be located at the top of the class.
    //  2 - main method can't throw an exception as there is no one who can catch it and react somehow.
    //  3 - do not avoid using try-catch block, it is a good mechanism for handling exceptions in Java.
    //  4 - to make this class easier I create MonthSelector class and remove the logic for finding a month into it
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        String month = scanner.nextLine();
        try {
            MonthSelector.monthSearch(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
