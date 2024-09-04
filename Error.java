import java.util.*;


public class Error {
    public static void solution(String str,int k){
        int max=0;
        HashMap<String,Integer> ans=new HashMap<>();
        for(int i=0;i<str.length()-2;i++){
            ans.put(str.substring(i,i+k),ans.getOrDefault(str.substring(i,i+k),0)+1);
        }
        Set<String> data=ans.keySet();//O(1)
        for(String s:data) {
            if (ans.get(s) > max) {
                max = ans.get(s);
                //System.out.println(s + " " + max);
            }
        }
        for(String s:data){
            if(ans.get(s)==max){
                System.out.println(s+" "+ans.get(s));
            }
        }
    }


    public static void main(String[] args) {
        String str="anabnanana";
        System.out.println("MAXIMUM OCCURENCE OF SUBSTRING");
        solution(str,3);
        System.out.println("SUBSTRING OF THE STRING");
        for(int i=0;i<str.length()-2;i++){
            System.out.println(str.substring(i,i+3));
        }
    }
}
