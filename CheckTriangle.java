import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b >c && b+c >a && c+a> b ){
            System.out.println("Triangle");
        }else{
            System.out.println("Not A Triangle");
        }
    }
}
