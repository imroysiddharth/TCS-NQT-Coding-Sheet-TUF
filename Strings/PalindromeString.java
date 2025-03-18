package Strings;

public class PalindromeString {

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        // String s = "racecar";
        String s = "racecars";
        System.out.println(isPalindrome(s));
    }
}
