public class SingleOccurenceInArray {
    public static int unique(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,4,3,3};//wvery no should be present is even time but only one number at one time
        System.out.println(unique(arr));
    }
}
