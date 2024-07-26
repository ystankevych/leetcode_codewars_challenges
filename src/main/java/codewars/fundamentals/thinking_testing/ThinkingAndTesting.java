package codewars.fundamentals.thinking_testing;

/**
 * 7 kyu. Thinking & Testing : True or False
 * Link to the task:
 * https://www.codewars.com/kata/56d931ecc443d475d5000003/solutions/java
 *
 * Link to the solution:
 * https://www.codewars.com/kata/reviews/56fb0f09e25ba1fd00000072/groups/668fb1890d96b2edd21b2d9d
 * Description:
 * No Story
 * No Description
 * Only by Thinking and Testing
 * Look at the results of the testcases, and guess the code!
 */
public class ThinkingAndTesting {
  public static int testTrueFalse(int n) {
    if(n == 0) {
      return 0;
    }
    return (n % 2) == 1 ? testTrueFalse(n / 2) + 1 : testTrueFalse(n / 2);
  }
}