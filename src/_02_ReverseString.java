import java.util.Scanner;

//Задача 2: Обратен низ
//Напиши метод на Java, който приема низ и го обръща. Методът трябва да върне обръщания низ.

public class _02_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = reverseString(input);
        System.out.println(result);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
