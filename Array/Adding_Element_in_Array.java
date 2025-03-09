package Array;

public class Adding_Element_in_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        System.out.println(sumElements(arr));
    }
    public static int sumElements(int arr[]){
        int sum= 0 ;

        for(int i=0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
