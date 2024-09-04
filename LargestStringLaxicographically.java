public class LargestStringLaxicographically {
    public static String largest(String[] arr){
        String largest="";
        for(int i=0;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        return largest;
    }
/*
NOTE:- STR1.compareTo(STR2)
       0:EQUAL
       <0:--ve str1<str2
       >0: +ve str1>str2
 */



    public static void main(String[] args) {
        String[] str={"sanjeev","mango","apple"};
        System.out.println(largest(str));
    }
}
