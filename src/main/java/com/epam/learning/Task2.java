package com.epam.learning;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialLine = scanner.nextLine();
        StringBuffer reversedLine = new StringBuffer(initialLine).reverse();
        System.out.println(reversedLine);
        scanner.close();
    }
}
