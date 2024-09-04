public class BinaryToDecimal {
    public static int convert(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int dig =n%10;
            dec=dec+dig*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(convert(101));
    }
}
