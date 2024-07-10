package codewars.fundamentals.sum_of_numbers;

import java.util.stream.IntStream;

/**
 * 7 kyu. Beginner Series #3 Sum of Numbers
 * https://www.codewars.com/kata/55f2b110f61eb01779000053/java
 * Given two integers a and b, which can be positive or negative,
 * find the sum of all the integers between and including them and return it.
 * If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 *
 * Examples (a, b) --> output (explanation)
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 * Your function should only return a number, not the explanation about how you get that number.
 */
public class Sum {
    public static int getSum(int a, int b) {
        return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }

    public static void main(String[] args) {
        // Output is 1
        System.out.println(getSum(1, 0));

        //Output is 3
        System.out.println(getSum(1, 2));

        //Output is 1
        System.out.println(getSum(0, 1));

        //Output is 1 (1 since both are same)
        System.out.println(getSum(1, 1));

        //Output is -1 (-1 + 0 = -1)
        System.out.println(getSum(-1, 0));

        //Output is 2 (-1 + 0 + 1 + 2 = 2)
        System.out.println(getSum(-1, 2));
    }
}
