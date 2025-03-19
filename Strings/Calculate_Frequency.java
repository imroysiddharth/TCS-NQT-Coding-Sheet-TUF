package Strings;

public class Calculate_Frequency {
    public static void cntFreq(String s){
        int freq[] = new int[26];
        for(int i=0; i<s.length() ;i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<freq.length ;i++){
            if(freq[i]!=0){
                System.out.println((char)(i+'a')+"->"+freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        String s = "takeuforward";
        cntFreq(s);
    }
}
