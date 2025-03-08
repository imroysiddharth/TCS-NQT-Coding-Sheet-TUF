public class Find_the_smallest_number_in_array{
    public static int findSmallest(int[] arr){

        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length ;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min ;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(findSmallest(arr));
    }
}