public class ShortestPath {
    public static int shortestFromOrigin(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='s') {
                y--;
            }else if(ch=='n'){
                y++;
            }else if(ch=='w'){
                x--;
            }else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        int d=(int)Math.sqrt(x2+y2);
        return d;
    }

    public static void main(String[] args) {
        String str="wneenesennn";
        System.out.println(shortestFromOrigin(str));
    }
}

