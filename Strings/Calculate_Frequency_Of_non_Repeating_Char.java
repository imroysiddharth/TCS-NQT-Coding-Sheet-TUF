package Strings;

public class Calculate_Frequency_Of_non_Repeating_Char {
    public static void cntFreqofUniqueChar(String s){
        int freq[] = new int[26];
        for(int i=0; i<s.length() ;i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0; i<freq.length ;i++){
            if(freq[i]==1 ){
                System.out.print((char)(i+'a')+" ");
            }
        }
    }
    public static void main(String[] args) {
        // String s = "takeuforward";
        String s = "google";
        cntFreqofUniqueChar(s);
    }
}
