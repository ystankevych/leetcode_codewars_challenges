package codewars.fundamentals.two_to_one;

/**
 * 7kyu. Two to One
 * Link to the kata
 * https://www.codewars.com/kata/5656b6906de340bd1b0000ac/java
 *
 * Link to my solution:
 * https://www.codewars.com/kata/reviews/5656b69faeb8cc437a000028/groups/669036776cca18da0e8eb9be
 *
 * Description:
 * Take 2 strings s1 and s2 including only letters from a to z.
 * Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 *
 * Examples:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        // concat two strings
        s1 += s2;

        // iterate over english alphabet and just check if string contains character.
        // if yes - append to the StringBuilder
        for (char a = 'a'; a <= 'z'; a++) {
            if (s1.indexOf(a) != -1) {
                res.append(a);
            }
        }
        // return the result
        return res.toString();

        // another approach using stream
        /*return (s1 + s2).chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());*/
    }
}