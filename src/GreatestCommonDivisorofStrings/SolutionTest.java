package GreatestCommonDivisorofStrings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testGcdUpperCaseLetters() {
        Solution solution = new Solution();
        String word1 = "PPP";
        String word2 = "P";
        String expected = "P";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdUpperCaseLettersWord2BeforeWord1() {
        Solution solution = new Solution();
        String word1 = "PPPPP";
        String word2 = "P";
        String expected = "P";
        String actual = solution.greatestCommonDivisorOfStrings(word2, word1);
        System.out.println("actual " + actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdDifferentPatterns() {
        Solution solution = new Solution();
        String word1 = "ABABAB";
        String word2 = "ABAB";
        String expected = "AB";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdNoCommonDivisor() {
        Solution solution = new Solution();
        String word1 = "ABC";
        String word2 = "DEF";
        String expected = "";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdSameStrings() {
        Solution solution = new Solution();
        String word1 = "XYZXYZ";
        String word2 = "XYZXYZ";
        String expected = "XYZXYZ";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdEmptyString() {
        Solution solution = new Solution();
        String word1 = "ABC";
        String word2 = "";
        String expected = "";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdOneCharacterStrings() {
        Solution solution = new Solution();
        String word1 = "A";
        String word2 = "A";
        String expected = "A";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdMultipleCharacterStrings() {
        Solution solution = new Solution();
        String word1 = "ABABAB";
        String word2 = "AB";
        String expected = "AB";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testGcdSubstringNotRepeating() {
        Solution solution = new Solution();
        String word1 = "ABCD";
        String word2 = "AB";
        String expected = "";
        String actual = solution.greatestCommonDivisorOfStrings(word1, word2);
        assertEquals(expected, actual);
    }
}
