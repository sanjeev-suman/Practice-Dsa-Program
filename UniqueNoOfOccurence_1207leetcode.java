import java.util.HashMap;
import java.util.HashSet;

public class UniqueNoOfOccurence_1207leetcode {
    public static boolean isUniqueOccurence(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> uniqueValues= new HashSet<>(map.values());
        return uniqueValues.size()==map.size();
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,6,6,6,5,5,5,5};
        System.out.println(isUniqueOccurence(arr));
    }
}
