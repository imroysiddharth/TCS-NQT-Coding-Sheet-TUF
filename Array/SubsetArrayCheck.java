package Array;

import java.util.HashMap;

public class SubsetArrayCheck {
      static boolean checkIfSubset(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        if(n1>n2)
           return false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n2;i++){
            // hm.put(arr2[i],hm.getOrDefault(arr2[i], 0)+1);
            if(hm.containsKey(arr2[i])){
                int count=hm.get(arr2[i]);
                hm.put(arr2[i],count+1);
            }
            else{
                hm.put(arr2[i],1 );
            }
        }
        for(int i=0;i<arr1.length;i++){


            if(!hm.containsKey(arr1[i]) )
               return false;

            

               if(hm.containsKey(arr1[i])) {
                int count=hm.get(arr1[i]);
                if(count-1!=0)
                   hm.put(arr1[i],count-1);
                else
                   hm.remove(arr1[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]={1,3,3,4,5,2};
        int arr2[]={11,12,13,15,16};
        System.out.println(checkIfSubset(arr1, arr2));
    }
}
