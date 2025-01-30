import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Задача 6: Проверка дали два низа са анаграми
//Напиши алгоритъм, който проверява дали два низа са анаграми.
//Анаграмите са думи, които съдържат едни и същи символи, но в различен ред
//(например "listen" и "silent").

public class _06_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = sc.nextLine().toLowerCase();
        String secondWord = sc.nextLine().toLowerCase();

        System.out.println(isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String firstWord, String secondWord) {

        if (firstWord.length() == secondWord.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : firstWord.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : secondWord.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
