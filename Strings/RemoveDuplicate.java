package Strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // String s= "takeyouforward" ;
        String s= "bcabc" ;
        System.out.println(removeDup(s));
    }
    public static String removeDup(String s){
        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']=1;
        }
        
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=0){
                sb.append(s.charAt(i));
                freq[s.charAt(i)-'a']--;
            }
        }
        return sb.toString();
    }
}
