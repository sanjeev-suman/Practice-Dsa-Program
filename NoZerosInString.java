public class NoZerosInString {
    public static void main(String[] args) {
        String str="1010101";
        int count=0,count1=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                count++;
            }else{
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
