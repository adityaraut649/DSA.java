import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
       // .1 Find the maximum value out of all the elements in the arry
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,45,56,768,87,453,34};
        int max = arr[0]; // compair any array element
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}

