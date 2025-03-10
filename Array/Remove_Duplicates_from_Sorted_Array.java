package Array;
//in place
public class Remove_Duplicates_from_Sorted_Array {

    public static void removeDuplicate(int arr[]){
        int i= 0;
        int j=i+1;
        while(i<arr.length-1){
            
            while(j<arr.length && arr[i]==arr[j]){
                j++;
            }
            if(j<arr.length){
                arr[i+1]=arr[j];
            }
            i++;
        }
    }
    public static void removeDuplicate2(int arr[]){
        int i= 0;
        for(int j=1 ; j<arr.length ; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5,6};

        removeDuplicate2(arr);
        for(int i:arr){
                System.out.print(i+" ");
        }
    }
}
