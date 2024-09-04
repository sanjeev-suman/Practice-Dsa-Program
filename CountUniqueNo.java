import java.util.HashMap;

public class CountUniqueNo {
    public static int no(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(i,0)+1);
        }
        return map.size();
    }
    public static void main(String[] args) {
        String str="1210";
        System.out.println(no(str));
    }
}
