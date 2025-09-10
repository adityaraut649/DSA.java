import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        // .1 Find the second largest element In the given Array.
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6, 7, 78, 8, 9, 8, 87, 76, 7};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}

