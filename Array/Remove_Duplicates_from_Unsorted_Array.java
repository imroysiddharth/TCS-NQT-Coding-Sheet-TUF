package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove_Duplicates_from_Unsorted_Array {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5,6};

        int ans[] =  removeDuplicateUnArr(arr);
        for(int i:ans){
                System.out.print(i+" ");
        }
    }

    public static int[] removeDuplicateUnArr(int arr[]){

       HashMap<Integer,Integer> hm  = new HashMap<>() ;
        for(int i = 0 ; i<arr.length ;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        ArrayList<Integer> al = new ArrayList<>(hm.keySet()) ;
        int ans[] = new int[al.size()];
        for(int i=0; i<al.size() ;i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}
