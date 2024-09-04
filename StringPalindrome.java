import java.util.Locale;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        str=str.toUpperCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="RaCecar";
        System.out.println(isPalindrome(str));
    }
}
