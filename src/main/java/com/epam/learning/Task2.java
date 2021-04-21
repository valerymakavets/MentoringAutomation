package com.epam.learning;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: do not create long lines of code, try to keep it simple (KISS programming principle).
        //  Sometimes it is better to add one more variable (String initialLine) but your code will be more readable
        String initialLine = scanner.nextLine();
        StringBuffer reversedLine = new StringBuffer(initialLine).reverse();
        System.out.println(reversedLine);
        scanner.close();
    }
}
