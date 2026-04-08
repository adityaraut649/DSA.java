import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        // .1 Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)
        Scanner sc = new Scanner(System.in);
       int [] arr = {83,21,38,69,74,12};
        int x = 81;
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i]+ " " + arr[j]);
                    break;
                }
            }
        }
    }
}

