class PrimeNumber {
    public static void main(String[] args) {

        /*   1.  Array simple syntax   */

       /* int[] arr = {12, 223, 54, 65, 768, 878, 89};
           System.out.println(arr[0]);
           System.out.println(arr[1]);
           System.out.println(arr[2]);
           System.out.println(arr[3]);
           System.out.println(arr[4]);
           System.out.println(arr[5]);    */

        /* 2.modification of arrya  */

       /*
            int[] arr = {12, 223, 54, 65, 768, 878, 89};
            System.out.println(arr[1]);

            you can modify this array
            arr[1] = 30;

            print array
            System.out.println(arr[1]);        */


        // 3. secound way off

       /*  int [] arr = new int[7];
         arr[0] = 31;
         arr[1] = 45;
         arr[2] = 467;
         arr[3] = 454;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);*/


        //  4. print using loop

        /*int[] arr = {12, 223, 54, 65, 768, 878, 89};

        for (int i = 0; i <=7; i++) {
            System.out.println(arr[i]);
        }*/


        // 5. length Operator

        /*int[] arr = {12, 223, 54, 65, 768, 878, 89};

        for (int i = 0; i <= arr.length; i++) {   // length Operator
            System.out.println(arr[i]);
        }
      */

       /* // 6. Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arrya Size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        //input
        System.out.println("Enter size of element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         // output
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }*/

        // question 1.
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n] ;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           sum += arr[i];
        }
        System.out.println(sum);*/

     // 2 . Question
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = 10;
        boolean a = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == x) {
                a = true;
                break;
            }
        }
        if (a == false) {
            System.out.println("Mila Nahi");
        } else {
            System.out.println("mila");
        }*/
    }

}

