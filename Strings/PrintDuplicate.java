package Strings;

public class PrintDuplicate {
    public static void main(String[] args) {
        String s= "sinstriiintng" ;
        // String s= "bcabc" ;
        printDup(s);
    }
    public static void printDup(String s){
       
        int freq[] = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']>=2){
                System.out.print(s.charAt(i)+" ");
                freq[s.charAt(i)-'a']=0;
            }
        }
    }
}
