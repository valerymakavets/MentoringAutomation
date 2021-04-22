package com.epam.learning;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstValue = scanner.nextInt();
        int secondValue = scanner.nextInt();
        int sumOfValues = firstValue + secondValue;
        int multiOfValues = firstValue * secondValue;
        System.out.println("Sum of values = " + sumOfValues);
        System.out.println("Multiplication of values = " + multiOfValues);
        scanner.close();
    }
}