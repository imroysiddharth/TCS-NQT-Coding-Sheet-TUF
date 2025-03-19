package Strings;
//cosidering no white spaces are available
public class MaximumOccurringChar {
    public static char cntMaxOccuringChar(String s){
        int freq[] = new int[26];
        for(int i=0; i<s.length() ;i++){
            freq[s.charAt(i)-'a']++;
        }
        int cnt = 0 ;
        char ch = s.charAt(0);
        for(int i=0; i<freq.length ;i++){
           if(cnt<freq[i]){
            cnt=freq[i];
            ch=(char)(i+'a');
           }
        }
        return ch;
    }
    public static void main(String[] args) {
        String s = "takeuforward";
       System.out.println(cntMaxOccuringChar(s));
    }

}
