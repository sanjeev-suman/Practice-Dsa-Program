public class MaxSubArraySum3 {  //kadane algorithm
    public static void maxSubArraySum(int[] num){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){   //time complexity is O(N)
                                         //Best time complexity
            cs+=num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("max sum is ="+ms);
    }
    public static void main(String[] args) {
        int[] num={1,-2,6,-1,3};
        maxSubArraySum(num);
    }
}
