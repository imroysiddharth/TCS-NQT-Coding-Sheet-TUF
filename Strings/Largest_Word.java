package Strings;

public class Largest_Word {
    static String maxLength(String str) {
        int len = str.length();
        int i = 0, j = 0;
        String maxWord="";
        int maxlength = 0, maxstart = 0;

        while (j <= len) {
               if (j < len && str.charAt(j) != ' ')
                      j++;

               else {
                      int currlength = j - i;

                      if (currlength > maxlength) {
                             maxlength = currlength;
                             maxstart = i;
                      }
                      j++;
                      i = j;
               }
        }

        maxWord = str.substring(maxstart, maxlength);
        return maxWord;
 }

 public static void main(String[] args) {
        String str = "Google Docs";

        System.out.print("Largest Word is: "+maxLength(str));
       

 }
}
