package MainTaskPackage;
import java.util.Scanner;

public class Task5 {

    public static void monthSearch (String month) throws Exception {
        switch (month) //todo: Мне кажется что через switch неправильно такое реализовывать..)
        {
            case "1":
                System.out.println("Январь");
                break;
            case "2":
                System.out.println("Февраль");
                break;
            case "3":
                System.out.println("Март");
                break;
            case "4":
                System.out.println("Апрель");
                break;
            case "5":
                System.out.println("Май");
                break;
            case "6":
                System.out.println("Июнь");
                break;
            case "7":
                System.out.println("Июль");
                break;
            case "8":
                System.out.println("Август");
                break;
            case "9":
                System.out.println("Сентябрь");
                break;
            case "10":
                System.out.println("Октябрь");
                break;
            case "11":
                System.out.println("Ноябрь");
                break;
            case "12":
                System.out.println("Декабрь");
                break;
            default:
                throw new Exception("Месяца с таким номером не существует");
        }
    }

    public static void main (String[]args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        String month = scanner.nextLine();
        monthSearch(month);
    }
}
