package Strings;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str = "Take12% *&u ^$#Forward";
        System.out.println(removeSpecialChar(str));
    }

    public static String removeSpecialChar(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length() ;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122){
                    sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
