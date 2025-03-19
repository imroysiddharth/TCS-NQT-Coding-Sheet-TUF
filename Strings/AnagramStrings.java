package Strings;

public class AnagramStrings {
    public static boolean isAnagram(String s1, String s2){
        int freq[]= new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0; i<s1.length() ;i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int i=0; i<s2.length() ;i++){
            if(freq[s2.charAt(i)-'a']==0){
                return false;
            }
            else{
                freq[s2.charAt(i)-'a']--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="FFF";
        String s2="FUT";
        // String s1="TUF";
        // String s2="FUT";
        System.out.println(isAnagram(s1.toLowerCase(), s2.toLowerCase()));
    }
}
