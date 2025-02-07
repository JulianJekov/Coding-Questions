public class _15_XOR {
    public static void main(String[] args) {
        //Finding unique number(one time present) in array if every other number is present exactly two times
        int[] numbers = {2, 3, 4, 5, 2, 3, 4, 5, 6};
        System.out.println("Unique number is : " + findUnique(numbers));
    }

    private static int findUnique(int[] numbers) {
        int unique = 0;
        for (int number : numbers) {
            unique ^= number;
        }
        return unique;
    }
}
