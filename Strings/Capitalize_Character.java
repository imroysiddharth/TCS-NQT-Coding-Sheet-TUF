package Strings;

public class Capitalize_Character {
    public static void main(String[] args) {
        // String s =" siddharth roy";
        String s ="take u forward is awesome";
        System.out.println(capitalizeChars(s));
    }
    public static String capitalizeChars(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length() ;i++){
            if(i==0 && sb.charAt(i)!=' '  || i!=0 && sb.charAt(i-1)==' '){
                sb.setCharAt(i, (char)(sb.charAt(i)-32));
            }
            if( i==sb.length()-1 || i!=0 && sb.charAt(i+1)==' '){
                if(sb.charAt(i)>=97 && sb.charAt(i)<=122)
                sb.setCharAt(i, (char)(sb.charAt(i)-32));
            }
        }
        return sb.toString();
    }
}
