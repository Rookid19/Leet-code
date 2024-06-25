package MergeStringsAlternate;

import java.util.ArrayList;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        String[] splitWord1 = word1.split("");
        String[] splitWord2 = word2.split("");
        int maxLength = Math.max(splitWord1.length,splitWord2.length);


        ArrayList<String> box = new ArrayList<>();

        for(int i=0; i < maxLength; i++){
            if(i < splitWord1.length){
                box.add(splitWord1[i]);
            }

            if(i < splitWord2.length){
                box.add(splitWord2[i]);
            }

        }

        String results = String.join("",box);

        return results;
    }
}