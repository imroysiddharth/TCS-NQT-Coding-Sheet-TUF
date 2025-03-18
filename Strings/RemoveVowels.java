package Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Take You Forward";
        String ans = removeV(s);
        System.out.println(ans);
    }

    public static String removeV(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length() ;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){continue;}
            if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){continue;}
            
                sb.append(str.charAt(i));
            
        }
        return sb.toString();
    }
}
