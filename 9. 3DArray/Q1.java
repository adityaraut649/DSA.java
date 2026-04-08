public class Q1 {
    public static void main(String[] args) {
        int arr[][][] = new int[3][3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = i * j * k;
                }
            }
        }
        System.out.println(arr[2][1][0]);
    }
}


// [depth][row][column]
