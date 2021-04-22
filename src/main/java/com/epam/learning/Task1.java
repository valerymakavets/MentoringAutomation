package com.epam.learning;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String greeting = "Hello " + name + "!";
        System.out.println(greeting);
        scanner.close();
    }
}
