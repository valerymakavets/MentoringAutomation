package com.epam.learning;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        String month = scanner.nextLine();
        try {
            MonthSelector.monthSearch(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
