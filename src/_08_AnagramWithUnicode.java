import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

public class _08_AnagramWithUnicode {

//    Задача 8: Валиден анаграм с Unicode поддръжка
//    Подобно на предишната анаграмна задача, но този път трябва да поддържаме Unicode символи
//    (не само английската азбука, но и символи като á, ö, é, ñ, ü и т.н.).

    public static void main(String[] args) {

        String firstWord = "él, ámOr!";
        String secondWord = "Roma él!";

        String firstCleanWord = removeDiacritics(firstWord).toLowerCase().replaceAll("[^a-zA-Z]", "");
        String secondCleanWord = removeDiacritics(secondWord).toLowerCase().replaceAll("[^a-zA-Z]", "");

        System.out.println(isAnagram(firstCleanWord, secondCleanWord));

    }

    private static String removeDiacritics(String word) {
        String normalize = Normalizer.normalize(word, Normalizer.Form.NFKD);
        return normalize.replaceAll("\\p{M}", "");
    }

    public static boolean isAnagram(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length()) {
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