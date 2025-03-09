package Array;

public class Average_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int average = avg(arr);
        System.out.println(average);
    }

    public static int avg(int arr[]){
        int average =0 ;
        for(int i=0; i<arr.length ;i++){
            average+=arr[i];
        }
        return average/arr.length;
    }
}
