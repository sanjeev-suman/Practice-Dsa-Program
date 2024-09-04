public class ConsecutiveCharacter{
    public static int maxpower(String s){
        int temp=1;
        int max=1;
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1]){
                temp++;
                //System.out.println(temp);
                max=(int)Math.max(max,temp);
                //System.out.println(max);
            }else{
                temp=1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(maxpower(s));
    }
}
