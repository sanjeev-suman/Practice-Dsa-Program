import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void sorting(ArrayList<Integer> ans){
        Collections.sort(ans);
    }
    public static void swap(ArrayList<Integer> ans){
        int temp=ans.get(0);
        System.out.println(temp);
        ans.add(0,ans.get(1));
        System.out.println(ans.get(0));
        ans.add(1,temp);
        System.out.println(ans.get(1));
        for(Integer i:ans) {
            System.out.print(i + " ");
        }
        System.out.println(ans.size());
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(6);
        ans.add(8);
        sorting(ans);
        for(Integer i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
        swap(ans);

    }
}
