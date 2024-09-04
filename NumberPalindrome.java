public class NumberPalindrome {
    public static boolean isPalindrome(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
             sum=sum*10+dig;
            n=n/10;
        }
        if(temp==sum){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(111));
    }
}
