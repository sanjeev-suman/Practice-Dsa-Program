public class Pattern {
    public static void p1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p4(int n){
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int chr=1;chr<=line;chr++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void p5(int n){
        for(int line=1;line<=n;line++){
            for(int space=1;space<=n-line;space++){
                System.out.print(" "+" ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void p6(int n){
        for(int line=1;line<=n;line++){
            for(int space=1;space<=n-line;space++){
                System.out.print(" ");
            }                                                //        *
            for(int star=1;star<=line;star++){               //      *   *
                                                             //    *   *   *
                System.out.print("*"+" ");                   //  *   *   *   *
            }
            System.out.println();
        }
    }
    public static void p7(int n){
        for(int line=1;line<=n;line++){
            for(int space=1;space<line;space++){
                System.out.print(" "+" ");
            }
            for(int star=1; star<=n-line+1; star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void dimand(int n){
        for(int line=1;line<=n;line++){
            for(int space=1;space<=n-line;space++){
                System.out.print(" "+" ");
            }
            for(int star=1;star<=2*line-1;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int line=1;line<=n;line++){
            for(int space=1;space<=line-1;space++){
                System.out.print(" "+" ");
            }
            for(int star=1;star<=2*n-2*line+1;star++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void hollogram(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==n||j==1||i==1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        p1(5);
        System.out.println();
        p2(5);
        System.out.println();
        p3(7);
        System.out.println();
        p4(5);
        System.out.println();
        p5(5);
        System.out.println();
        p6(5);
        System.out.println();
        p7(5);
        System.out.println();
        dimand(5);
        System.out.println();
        hollogram(4);
        }
}
