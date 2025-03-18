package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s ="Siddharth Roy";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        int j = s.length() -1 ;
        while (j>0) {
            sb.append(s.charAt(j));
            j--;
        }
        return sb.toString();
    }
}
