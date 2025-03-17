package Array;

public class Equilibrium_index_in_an_array {
    public static int EquilibriumIndex(int[] arr){
        int i = 0;
        int totalSum = 0; 
        int localSum=0;
        for(int ele:arr){
            totalSum+=ele;
        } 
        while (i<arr.length) {         
            double s = totalSum - Math.max(arr[i], -1*arr[i]);
            if(i!=0){
                localSum += arr[i-1];
            }
            System.out.println(localSum+" "+s/2);
            if(localSum == s/2){
                return i ;
            }
            i++;
        }
        return -1 ;
    }
    public static void main(String args[]){
        int arr[]={2,3,-1,8,4};
        // int arr[]={4,1,6,3,2};
        // int arr[]={1,-1,4};
        System.out.println(EquilibriumIndex(arr));

    }
}
