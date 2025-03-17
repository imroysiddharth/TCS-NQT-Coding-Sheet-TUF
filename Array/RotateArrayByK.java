package Array;

public class RotateArrayByK {
    static void reverseArray(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotateElementsByk(int arr[],int k,char s){
        int n=arr.length;
        if(s=='L'){
            k=(n-k)%n;
        }
        else{
            k=k%n;
        }
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr, k, n-1);
    }
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7};
    int k=9;
    char s='R';
    rotateElementsByk(arr,k,s);
    for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
  }
}
