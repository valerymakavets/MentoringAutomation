package com.epam.learning;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // TODO: it is better to add a new variable (String greeting) for keeping the whole value,
        //  it allows you to reuse the variable somewhere else
        String greeting = "Привет " + name + "!"; // TODO: no Russian
        System.out.println(greeting);
        scanner.close(); //TODO: Надо ли закрывать? Yes
    }
}
