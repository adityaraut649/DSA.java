package String;

import java.util.Scanner;

public class Imp_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // ------------------------------------------
        // Example 1: String concatenation
        // ------------------------------------------
        String s1 = "Nisha";
        // s1 = s1 + "Aditya";   // Another way to concatenate
        s1 += " ";
        s1 += "Raut";
        System.out.println(s1);   // Output: Nisha Raut


        // ------------------------------------------
        // Example 2: Substring methods
        // ------------------------------------------
        String str = "abcd";
        System.out.println(str.substring(0, 3)); // "abc"
        System.out.println(str.substring(0, 4)); // "abcd"
        System.out.println(str.substring(2));    // "cd"
        System.out.println(str.substring(0, 0)); // "" (empty string)


        // ------------------------------------------
        // Example 3: Printing all substrings
        // ------------------------------------------
        String s = "abcd";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }


        // ------------------------------------------
        // Example 4: String immutability
        // ------------------------------------------
        String a = "Hello";
        String b = "Hello";

        // a.charAt(0) = 'j';   // ❌ Not allowed in Java (Strings are immutable)

        System.out.println(a);  // Output: Hello
        System.out.println(b);  // Output: Hello

        // Both 'a' and 'b' point to the same string object in the String Pool
    }
}



