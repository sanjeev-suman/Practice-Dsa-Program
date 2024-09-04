import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }

        }
        return map.isEmpty();
    }
    public static boolean isAnagram(String s,String t){
        char[] s1=s.toCharArray();
        char[] s2=s.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);

    }

    public static void main(String[] args) {
        String s="haret";
        String t="earth";
        System.out.println(anagram(s,t));
        System.out.println(isAnagram(s,t));
    }
}
