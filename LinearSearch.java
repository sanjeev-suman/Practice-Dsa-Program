public class LinearSearch {
    public static int linearSearch(int[] num,int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] num={1,5,8,6,9};
        int index=linearSearch(num,10);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("index is :"+index);
        }

    }
}
