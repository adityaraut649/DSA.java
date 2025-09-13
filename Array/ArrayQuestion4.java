import java.util.Scanner;

public class ArrayQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of first array (number of digits)
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();  // store digits in array
        }

        // Read size of second array (number of digits)
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();  // store digits in array
        }

        // Result array length = maximum of n1 and n2
        int[] sum = new int[n1 > n2 ? n1 : n2];

        int c = 0;  // carry for addition

        // Pointers for last index of each array and result array
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        // Add digits from rightmost to leftmost (like pen-paper addition)
        while (k >= 0) {
            int d = c; // start with carry

            if (i >= 0) {
                d += a1[i];  // add digit from first array
            }

            if (j >= 0) {
                d += a2[j];  // add digit from second array
            }

            c = d / 10;   // calculate new carry
            d = d % 10;   // single digit to store in result

            sum[k] = d;   // place digit in result

            // move one step left in all arrays
            i--;
            j--;
            k--;
        }

        // If carry is left after finishing loop, print it
        if (c != 0) {
            System.out.println(c);
        }

        // Print result array (digit by digit, line by line)
        for (int val : sum) {
            System.out.println(val);
        }
    }
}

//n1 = 3, a1 = [9, 9, 9]
//
//n2 = 3, a2 = [1, 0, 1]
//
//sum = new int[3] = [0, 0, 0]
//
//c = 0
//
//i = 2, j = 2, k = 2

/*
Iteration 1 (i=2, j=2, k=2)

d = c = 0

d += a1[2] = 9 → d = 9

d += a2[2] = 1 → d = 10

c = 10 / 10 = 1

d = 10 % 10 = 0

sum[2] = 0 → [0, 0, 0]

Decrement: i=1, j=1, k=1*/
