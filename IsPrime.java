public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrim(13));
    }
    public static boolean isPrim(int n){
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }else{
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
