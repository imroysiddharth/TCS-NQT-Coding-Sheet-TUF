package Strings;

public class CountCharacters {
    public static void main(String[] args) {
        
        String str= "Take u forward is Awesome";
        countChars(str);
        count(str);
       
    }
    public static void countChars(String s){
        int [] freq  = new int[26];
        StringBuilder sb   =  new StringBuilder(s.toLowerCase());
        int whiteSpaces=0;
        for(int i=0 ; i<sb.length() ; i++){
            char c = sb.charAt(i);
            if(c!=' '){
                freq[c-'a']++;
            }else{
                whiteSpaces++;
            }
        }

        for(int i=0; i<freq.length ; i++){
            char ch = (char)(i+'a') ;
            if(freq[i]!=0){
                System.out.println(ch+" -> "+freq[i]);
            }
        }
        System.out.println("whiteSpace"+" -> "+whiteSpaces);
    }
    public static void count(String s){
        StringBuilder sb   =  new StringBuilder(s.toLowerCase());
        int vowel=0;
        int consonant=0;
        int white=0;
        for(int i=0;i<sb.length() ;i++){
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
                vowel++;
            }else if(sb.charAt(i)==' '){
                white++;
            }
            else{
                consonant++;
            }
        }

        System.out.println("Vowels - "+vowel);
        System.out.println("Consonant - "+consonant);
        System.out.println("WhiteSpaces - "+white);
    }
}
