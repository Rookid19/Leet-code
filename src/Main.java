import MergeStringsAlternate.Solution;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        String results = solution.mergeAlternately(word1,word2);
        System.out.println("pppppxx "+ results);

        scanner.close();
    }
}

