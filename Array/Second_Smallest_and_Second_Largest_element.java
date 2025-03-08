package Array;
public class Second_Smallest_and_Second_Largest_element {

    public static int secondSmallest(int arr[]){
        int smin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(min>arr[i]){
                smin = min ;
                min=arr[i];
            }
            else  if(smin>arr[i] && arr[i]!=min)smin=arr[i];
        }
        return smin;
    }


    public static int secondLargest(int arr[]){
        int smax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ; i++){
            if(max<arr[i]){
                smax = max ;
                max = arr[i];
            }
            else if(smax<arr[i] && arr[i]!=max){
                smax = arr[i];
            }
        }        
        return smax;

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(secondSmallest(arr));
        System.out.println(secondLargest(arr));
    }
}
