public class _01_FizzBuzz {
//    Задача 1: Принтирай числата от 1 до 100
//    Напиши програма на Java, която отпечатва числата от 1 до 100, като:
//
//    За числа, кратни на 3, принтирай "Fizz".
//    За числа, кратни на 5, принтирай "Buzz".
//    За числа, кратни и на 3, и на 5, принтирай "FizzBuzz".

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
