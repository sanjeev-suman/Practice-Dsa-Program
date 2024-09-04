import java.util.HashMap;

public class Pangram {
    public static boolean isPangram(String str){
        str=str.replace(" ","");
        System.out.println(str);
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map.size()==26;
    }
    public static void main(String[] args) {
       String str="the quick brown fox jumps over a lazy dog";
        System.out.println(isPangram(str));
    }
}
