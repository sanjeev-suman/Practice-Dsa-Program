public class QuickSort {
    public static void quickSot(int si,int ei,int[] arr){
        if(si>=ei){
            return;
        }
        //kaam
        int pidx=partition(si,ei,arr);
        quickSot(si,pidx-1,arr);
        quickSot(pidx+1,ei,arr);
    }
    public static int partition(int si,int ei,int[] arr){
        int pivot=arr[ei];
        int i=si-1;//to make place for els smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr={6,3,8,8,2,5};
        quickSot(0,arr.length-1,arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
