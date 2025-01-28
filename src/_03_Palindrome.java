import java.util.Scanner;

//Задача 3: Проверка за палиндром
//Напиши метод, който приема низ и проверява дали той е палиндром.
//Палиндром е дума, която е същата, когато се чете отляво надясно и отдясно наляво (например, "racecar", "madam").

public class _03_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String word) {
        int firstPointer = 0;
        int secondPointer = word.length() - 1;

        while (firstPointer <= secondPointer) {
            if (word.charAt(firstPointer) != word.charAt(secondPointer)) {
                return false;
            }
            firstPointer++;
            secondPointer--;
        }
        return true;
    }
}
