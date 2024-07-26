package codewars.fundamentals.next_perfect_square;

/**
 * 7 kyu. Find the next perfect square! (Java)
 * Link to the kata: https://www.codewars.com/kata/56269eb78ad2e4ced1000013/java
 *
 * Link to my solution: https://www.codewars.com/kata/reviews/5626a1035ecb354ee1000050/groups/66956c90745a016541d28d10
 *
 * Description:
 * You might know some pretty large perfect squares. But what about the NEXT one? *
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter.
 * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * If the argument is itself not a perfect square then return either -1 or an empty value like None or null,
 * depending on your language. You may assume the argument is non-negative.
 *
 * Example:
 * 121 --> 144
 * 625 --> 676
 * 114 --> -1  #  because 114 is not a perfect square
 */
public class NumberFun {
  public static long findNextSquare(long sq) {double currentSquare = Math.sqrt(sq);
        return currentSquare % 1 == 0 ? (long) Math.pow(++currentSquare, 2) : -1L;
  }
}