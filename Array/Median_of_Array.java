package Array;

import java.util.ArrayList;

public class Median_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arr1[]={1,2,3,4,5,6};
       
        System.out.println(findMedian(arr));
        System.out.println(findMedian(arr1));
    }

    public static double findMedian(int[] arr){
        int size = arr.length;
        mergeSort(arr,0,size-1);
        if(size%2!=0){
            return arr[size/2];
        }
        
        return (double)(arr[(size/2)-1]+arr[size/2])/2;
    }

     public static void merge(int arr[], int si, int mid, int li) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = si;
        int j = mid + 1;
        while (i <= mid && j <= li) {
            if (arr[i] < arr[j]) {
                temp.add(arr[i]);
                i++;
            } else if (arr[i] > arr[j]) {
                temp.add(arr[j]);
                j++;
            } else {
                temp.add(arr[i]);
                temp.add(arr[j]);
                i++;
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= li) {
            temp.add(arr[j]);
            j++;
        }

        for(int k = si ; k<=li ; k++){
            arr[k] = temp.get(k-si);
        }
    }

    public static void mergeSort(int arr[], int si, int li) {
        if (si >= li)
            return;
        int mid = si + (li - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, li);
        merge(arr, si, mid, li);
    }

}
