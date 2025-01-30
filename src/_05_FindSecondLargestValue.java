import java.util.Arrays;
import java.util.Scanner;

public class _05_FindSecondLargestValue {

//    Задача 5: Намиране на втората най-голяма стойност в масив
//    Напиши алгоритъм, който намира втората най-голяма стойност в масив от цели числа.
//    Ако масивът няма достатъчно елементи (например, съдържа само един елемент),
//    алгоритъмът трябва да върне съобщение като: „Няма достатъчно елементи“.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] data = input.split(" ");
        int[] numbers = Arrays.stream(data).mapToInt(Integer::parseInt).toArray();

        if (numbers.length <= 1) {
            System.out.println("Not enough elements");
            return;
        }

        int largestElement = findFirstLargestElement(numbers);
        int secondLargestElement = findSecondLargestElement(numbers, largestElement);

        System.out.println("Second largest element is " + secondLargestElement);
    }

    public static int findFirstLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findSecondLargestElement(int[] arr, int largest) {
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            if (currentElement < largest && currentElement > secondLargest) {
                secondLargest = currentElement;
            }
        }
        return secondLargest;
    }
}
