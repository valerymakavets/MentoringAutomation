package MainTaskPackage;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer reversedLine = new StringBuffer(scanner.nextLine()).reverse();
        System.out.println(reversedLine);
        scanner.close();
    }
}
