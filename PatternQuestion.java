public class PatternQuestion {
    public static void main(String arg[]){
        pattern3(4);
    }
    public static void pattern1(int n){
        /*

        *           i=1    j=1
        * *         i=2    j=2
        * * *       i=3    j=3
        * * * *     i=4    j=4

         */
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        /*

        * * * *    i=1 j=4
        * * *      i=2 j=3
        * *        i=3 j=2
        *          i=4 j=1

         */
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        int i,space,j;
        /*

        * * * *    i=1 j=4 space=0
          * * *    i=2 j=3 space=1
            * *    i=3 j=2 space=2
              *    i=4 j=1 space=3
         */
      for( i=1;i<=n;i++){         // n=4                  // for(int i=0;i<n;i++)
          for( space=0;space<i-1;space++){
              System.out.print(" "+" ");
          }
          for( j=n;j>=i;j--){
              System.out.print("*"+ " ");
          }
          System.out.println();
      }
   }
}
