public class MaxSubArraySum1 {
    public static void maxSubArraySum(int[] num){
        int curSum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            //int start=i;
            for(int j=i;j<num.length;j++){    //time complexity of this program is = O(n3)
               // int end=j;
                curSum=0;
                for(int k=i;k<=j;k++){
                    curSum+=num[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int[] num={1,-2,6,-1,3};
        maxSubArraySum(num);

    }
}
