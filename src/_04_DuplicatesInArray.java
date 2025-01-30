import java.util.HashSet;
import java.util.Set;

//Задача 4: Намиране на дубликати в масив
//Напиши метод, който приема масив от цели числа и проверява дали има повтарящи се елементи.
//Методът трябва да върне true, ако има дубликати, и false, ако няма.

public class _04_DuplicatesInArray {
    public static void main(String[] args) {
        int[] noDuplicates = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //should return false
        int[] duplicates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9}; //should return true

        System.out.println(checkForDuplicates(noDuplicates));
        System.out.println(checkForDuplicates(duplicates));

    }

    public static boolean checkForDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
