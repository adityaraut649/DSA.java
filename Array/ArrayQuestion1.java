import java.util.*;

public class ArrayQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Span of an Array
        int n = sc.nextInt();
        int arr[] = new int[n];      //
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(n);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {          // Max of an array
                max = arr[i];
            }
            if (arr[i] < min) {          // Min of an array
                min = arr[i];
            }
        }
        int sub = max - min;
        System.out.println(sub);    
    }
}
