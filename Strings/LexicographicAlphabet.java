package Strings;

public class LexicographicAlphabet {
    public static void main(String[] args) {
        String str = "abcdxyzABCDXYZ";
        System.out.println(ChangeToNextChar(str));
    }

    public static String ChangeToNextChar(String s){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int)(s.charAt(i));
            if (ascii == 90)
              ans.append((char)(65));
      
            else if (ascii == 122)
              ans.append((char)(97));
      
            else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122))
              ans.append((char)(ascii + 1));
          }
          return ans.toString();
    }
}
