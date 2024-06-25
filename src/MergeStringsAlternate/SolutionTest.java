package MergeStringsAlternate;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testMergeAlternatelyEqualLength() {
        Solution solution = new Solution();
        String word1 = "Hello";
        String word2 = "World";
        String expected = "hweolrllod";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeAlternatelyWord2BeforeWord1() {
        Solution solution = new Solution();
        String word1 = "Programming";
        String word2 = "Java";
        String expected = "PJaorvagamming";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeAlternatelyWord2Longer() {
        Solution solution = new Solution();
        String word1 = "Java";
        String word2 = "Programming";
        String expected = "jparvoagramming";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeAlternatelyEmptyStrings() {
        Solution solution = new Solution();
        String word1 = "";
        String word2 = "";
        String expected = "";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeAlternatelyOneEmptyString() {
        Solution solution = new Solution();
        String word1 = "Hello";
        String word2 = "";
        String expected = "Hello";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMergeAlternatelyUnicodeCharacters() {
        Solution solution = new Solution();
        String word1 = "😀🌍";
        String word2 = "🚀🌕";
        String expected = "😀🚀🌍🌕";
        String actual = solution.mergeAlternately(word1, word2);
        assertEquals(expected, actual);
    }
}
