import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        System.out.println("\nTask 1\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        // Задание 2

        System.out.println("\nTask 2\n");

        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // Задание 3

        System.out.println("\nTask 3\n");

        fullName = "Иванов Семён Семёнович";

        fullName = fullName.replace('ё', 'е');

        System.out.println(fullName);
    }
}