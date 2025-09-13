import java.util.*;

public class ArryaQuestion2 {
    public static void main(String[] args) {
        // Find element in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int in = sc.nextInt();
        int inx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == in) {
                inx = i;
            }
        }
        System.out.println(inx);             // printing index
    }
}
