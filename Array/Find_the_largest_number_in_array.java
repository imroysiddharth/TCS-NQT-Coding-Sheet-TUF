package Array;
public class Find_the_largest_number_in_array {
    public static int findLargest(int[] arr){
        

        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int arr[]={10,10,10,4,5,6,7,10,10};
        System.out.println(findLargest(arr));
    }
}
