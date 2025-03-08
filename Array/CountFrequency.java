package Array;

import java.util.HashMap;

public class CountFrequency {

    public static void cntFrequency(int arr[]){
        HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int i = 0; i<arr.length ;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer k : hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2,3,4,3,4,1};
        cntFrequency(arr);
    }
}
