import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reserse(arr);

        for (int val: arr) {
            System.out.println(val);
        }
    }
   public  static void reserse(int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

}
