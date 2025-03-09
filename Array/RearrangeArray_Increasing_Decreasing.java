package Array;

import java.util.ArrayList;

public class RearrangeArray_Increasing_Decreasing {

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
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

    public static void rearrangeArr(int arr[]) {
        mergeSort(arr, 0, arr.length - 1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        int size = arr.length - 1;
        reverse(arr, arr.length / 2, size);
    }

    public static void main(String[] args) {
        int arr[] = {12, 7, 3, 4, 3, 4, 1};

        rearrangeArr(arr);

        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
