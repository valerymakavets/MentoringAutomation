package com.epam.learning;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfValues = scanner.nextInt();
        int[] array = initializeArrayForPrinting(numberOfValues);
        printFromNewLine(array);
        printInSingleLine(array);
    }

    private static int[] initializeArrayForPrinting(int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void printInSingleLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void printFromNewLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
