package MergeStringsAlternate;

import java.util.ArrayList;

public class Solution {

    /**
     * Merges two strings alternately.
     *
     * @param word1 First input string
     * @param word2 Second input string
     * @return Merged string alternately from word1 and word2
     */
    public String mergeAlternately(String word1, String word2) {
        // Convert input strings to lowercase
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Split input strings into arrays of characters
        String[] splitWord1 = word1.split("");
        String[] splitWord2 = word2.split("");

        // Determine the maximum length between the two arrays
        int maxLength = Math.max(splitWord1.length, splitWord2.length);

        // ArrayList to store alternately merged characters
        ArrayList<String> box = new ArrayList<>();

        // Merge characters alternately from splitWord1 and splitWord2 arrays
        for (int i = 0; i < maxLength; i++) {
            // Add character from splitWord1 if it exists at index i
            if (i < splitWord1.length) {
                box.add(splitWord1[i]);
            }

            // Add character from splitWord2 if it exists at index i
            if (i < splitWord2.length) {
                box.add(splitWord2[i]);
            }
        }

        // Join the ArrayList into a single string
        String results = String.join("", box);

        return results;
    }
}
