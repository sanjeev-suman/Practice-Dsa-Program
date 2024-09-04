public class DecimalToBinary {
    public static int convert(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int dig =n%2;
            bin=bin+dig*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(convert(10));
    }
}
