public class MaxSubArraySum2 {
    public static void maxSubArraySum(int[] num){
        int n=num.length;
        int curSum;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix=new int[n];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<n;i++){
            //int start=i;
            for(int j=i;j<n;j++){
                //int end=j;
                curSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<curSum){
                    maxSum=curSum;
                }                                       //time complexity is = O(n2)
            }
        }
        System.out.println("Max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int[] num={1,-2,6,-1,3};
        maxSubArraySum(num);
    }
}
