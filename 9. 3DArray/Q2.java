import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int p = sc.nextInt();
      int arr[][][] = new int[n][m][p];
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              for (int k = 0; k < p; k++) {
                  arr[i][j][k] = sc.nextInt();
              }
          }
      }
      
      // Print the matrix
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              for (int k = 0; k < arr[i][j].length; k++) {
                  System.out.print(arr[i][j][k] + " ");
              }
              System.out.println();
          }
      }
    }
}
