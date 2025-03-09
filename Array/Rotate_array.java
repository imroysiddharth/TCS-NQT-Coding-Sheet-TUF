package Array;

public class Rotate_array {

    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    public static void rotateArr(int[] arr, int k){
        int n = arr.length;
        k = (n-k)%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr,k,n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotateArr(arr, 3);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
