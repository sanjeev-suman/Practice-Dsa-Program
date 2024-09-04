import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello sonam");
        int a,b,c,sum;
        Scanner s  = new Scanner(System.in);  //  to read value from user
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        sum=a+b+c;
        System.out.println("the sum of three numbers is:"+sum);
    }
}