public class FirstOccurence {
    public static int firstOccurence(int[] arr,int i,int key){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return firstOccurence(arr,i+1,key);
    }
    public static int lastOccurence(int[] arr,int i,int key){
        if(i==arr.length) return -1;
        int isFound= lastOccurence(arr,i+1,key);
        if(isFound==-1 && arr[i]==key) return i;
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,4,5,6};
        System.out.println(firstOccurence(arr,0,5));
        System.out.println(lastOccurence(arr,0,5));
    }
}
