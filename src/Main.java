
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ================================ MERGE STRINGS ALTERNATE ==========================================
//            Helper.mergeStringsAlternately();
//        ================================ Greatest Common Divisor of Strings =====================================
            Helper.greatestCommonDivisorofStrings();
    }
}

class Helper {
    public static void mergeStringsAlternately() {
        MergeStringsAlternate.Solution solution = new MergeStringsAlternate.Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scanner.next();
        System.out.println("Enter second word: ");
        String word2 = scanner.next();

        String results = solution.mergeAlternately(word1, word2);
        System.out.println("Merged result: " + results);

        scanner.close();
    }

    public static void greatestCommonDivisorofStrings(){

        GreatestCommonDivisorofStrings.Solution solution = new GreatestCommonDivisorofStrings.Solution();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scanner.next();
        System.out.println("Enter second word: ");
        String word2 = scanner.next();

        String results = solution.greatestCommonDivisorOfStrings(word1.toUpperCase(), word2.toUpperCase());
        System.out.println("Greatest common divisor: " + results);

        scanner.close();
    }
}