package codewars.strings.complementary_dna;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * 7 kyu. Complementary DNA
 * <a href="https://www.codewars.com/kata/reviews/5559c4009f65514a9d0000b0/groups/6685b456e218f2cf5e9ee4f4"/a>
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
 * for the development and functioning of living organisms.
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * Your function receives one side of the DNA (string, except for Haskell);
 * you need to return the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 * <p>
 * Example: (input --> output)
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 */

public class DnaStrand {
    public static final Map<Character, Character> COMPLEMENTS;

    static {
        COMPLEMENTS = Map.of(
                'A', 'T',
                'T', 'A',
                'C', 'G',
                'G', 'C');
    }
    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(c -> (char)c)
                .map(COMPLEMENTS::get)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
