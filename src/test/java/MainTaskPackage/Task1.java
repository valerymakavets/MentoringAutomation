package MainTaskPackage;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name + "!");
        scanner.close(); //todo:Надо ли закрывать?
    }
}
