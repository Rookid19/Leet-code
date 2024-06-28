package GreatestCommonDivisorofStrings;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Solution {
    public String greatestCommonDivisorOfStrings(){

        String str1 = "LEET";
        String str2 = "CODE";

        int gcdValue = gcd(str1.length(),str2.length());
        System.out.println(gcdValue);

        String gcdValueSubstring = str2.substring(0,gcdValue);

        Boolean str1Check = gcdValueSubstring.repeat(str1.length()/gcdValue).equals(str1);
        Boolean str2Check = gcdValueSubstring.repeat(str2.length()/gcdValue).equals(str2);

        System.out.println("true");

        String results  = str1Check && str2Check ? gcdValueSubstring : "";

        return results;
    }

    public int gcd(int a,int b){
        // using Euclidean Algorithm in maths
        // a is the numerator
        // b is the denominator
        // r is the remainder if (a / b) => r = a % b
        // if b is not equal to 0 then b becomes a and r becomes b
        // The recursive loop continues till we get b to be zero
        if(b == 0){
            return a;
        }
       return gcd(b,a%b);
    }

}
