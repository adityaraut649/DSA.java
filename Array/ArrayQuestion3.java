import java.util.Scanner;

public class ArrayQuestion3 {
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();

        // Declare an array of size n
        int arr[] = new int[n];

        // Populate the array with integer inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max with the first element of the array
        int max = arr[0];

        // Find the maximum value in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print a vertical histogram representing array values
        // Each row corresponds to a "floor" starting from max height down to 1
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                // Print '*' if the element is at least as tall as current floor, otherwise print space
                if (arr[i] >= floor) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to next line after printing one level of the histogram
            System.out.println();
        }
    }
}