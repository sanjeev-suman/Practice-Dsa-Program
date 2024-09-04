public class ReverseArray {
    public static void reverseArray(int[] num){
        int first=0,last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] num={1,5,6,3,4};
        reverseArray(num);
        for(int i:num){
            System.out.print(i+" ");//enhance for loop
        }
    }
}
