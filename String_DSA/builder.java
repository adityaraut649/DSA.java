package String;

import java.util.Scanner;

public class builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------------------------------------------
        // Example 1: Append
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        str.append(" Aditya");
//        System.out.println(str);   // Output: Hello Aditya


        // ------------------------------------------
        // Example 2: setCharAt
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        str.setCharAt(0, 'M');
//        System.out.println(str);   // Output: Mello


        // ------------------------------------------
        // Example 3: insert
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        str.insert(2, 'n');
//        System.out.println(str);   // Output: Henllo


        // ------------------------------------------
        // Example 4: deleteCharAt
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        str.deleteCharAt(2);
//        System.out.println(str);   // Output: Helo


        // ------------------------------------------
        // Example 5: reverse
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        System.out.println(str);   // Output: Hello
//        str.reverse();
//        System.out.println(str);   // Output: olleH


        // ------------------------------------------
        // Example 6: delete (range)
        // ------------------------------------------
//        StringBuilder str = new StringBuilder("Hello");
//        str.delete(2, 4);          // deletes characters at index 2 and 3
//        System.out.println(str);   // Output: Heo


        // ------------------------------------------
        // Example 7: take input
        // ------------------------------------------
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(str);


        // ------------------------------------------
        // Question: Toggle case of a string
        // ------------------------------------------
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') continue;   // skip spaces

            int ascii = (int) ch;

            if (ch >= 'a' && ch <= 'z') {
                // Lowercase → Uppercase
                ascii -= 32;
            } else if (ch >= 'A' && ch <= 'Z') {
                // Uppercase → Lowercase
                ascii += 32;
            }

            str.setCharAt(i, (char) ascii);
        }
        System.out.println(str);
    }
}
