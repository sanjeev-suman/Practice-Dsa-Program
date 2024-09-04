public class BubbleSort {
    public static void bubleSort(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static boolean isSmaller(int[] arr,int i,int j){
          if(arr[i]<arr[j]){
              return true;
          }else{
              return false;
          }
    }

    public static void main(String[] args) {
        int[] arr={4,7,5,6,10,9};
        bubleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
