package Strings;

public class RemoveSpaces {
    public static String removeWhiteSpace(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length() ;i++){
               if(str.charAt(i)==' '){continue;}
            
                sb.append(str.charAt(i));
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        System.out.println(removeWhiteSpace(str));
    }
}
