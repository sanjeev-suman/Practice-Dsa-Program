public class PairArray {
    public static void printPairs(int[] num){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] num={1,5,8,7,9};
        printPairs(num);//sum of all pairs in array is :n(n-1)/2
    }
}
