public class SumOfPrimeNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,91,13,11,2};
        int a=sumOfPrimeNumber(arr);
        System.out.println(a);
    }
    public static int sumOfPrimeNumber(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            boolean b=isPrim(arr[i]);
            if(b){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static boolean isPrim(int n){
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

}