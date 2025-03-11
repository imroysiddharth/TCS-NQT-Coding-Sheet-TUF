import java.util.ArrayList;
import java.util.Scanner;

public class TcsArrayInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str = "{1,1,1,2,3,4,4,5,6}";

        ArrayList<Integer> al = new ArrayList<>() ;
        for(int i= 0 ; i<str.length() ; i++){
            
            // int n = str.charAt(i); 
            // if(n>47 && n<58){
            //     System.out.print(n+" ");
            //     al.add(n-48);
            // }
            char n = str.charAt(i);
            if(n>47 && n<58){
                System.out.print(n+" ");
                al.add((int)(n-'0'));
            }
        }
        System.out.println();
        System.out.println(al);

        int min = Integer.MAX_VALUE ;
        for(int i:al){
            if(i<min)min=i;
        }
        System.out.println(min);
        sc.close();
    }
}
