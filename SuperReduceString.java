public class SuperReduceString {
    /*
    Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation,
    select a pair of adjacent letters that match, and delete them.
    Delete as many characters as possible using this method and return the resulting string. If the final
    string is empty, return Empty String
Example.
    aab shortens to b in one operation: remove the adjacent a characters.
    Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.
    Function Description
    Complete the superReducedString function in the editor below.
    superReducedString has the following parameter(s):
    string s: a string to reduce
Returns
    string: the reduced string or Empty String
     */
    public static String superReducedString(String s) {
// Concept of string builder //and how to use string builder in such question
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {

            if (sb.charAt(i) == sb.charAt(i + 1)) {

                sb.delete(i, i + 2);

                i = -1;
            }
        }
        if (sb.length() == 0) {

            return "Empty String";
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String s="aab";
        String a=superReducedString(s);
        System.out.println(a);
    }
}

