public class MergeTwoArray {
    public static int[] mergeTwoSortedArray(int[] a,int[] b){
        int[] arr=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<a[j]){
                arr[k]=a[i];
                i++;
                k++;
            }else{
                arr[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6,8};
        int[] arr1={3,7,9,23,45,67};
        int[] arr2=mergeTwoSortedArray(arr,arr1);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
