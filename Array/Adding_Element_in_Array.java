package Array;

import java.util.*;

public class Adding_Element_in_Array {
    // Insert at the beginning
    static int[] insertAtBeginning(int[] arr, int value) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        newArr[0] = value;
        System.arraycopy(arr, 0, newArr, 1, n);
        return newArr;
    }

    // Insert at the end
    static int[] insertAtEnd(int[] arr, int value) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        System.arraycopy(arr, 0, newArr, 0, n);
        newArr[n] = value;
        return newArr;
    }

    // Insert at a specific position (1-based index)
    static int[] insertAtPosition(int[] arr, int value, int pos) {
        int n = arr.length;
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position");
            return arr;
        }
        int[] newArr = new int[n + 1];
        System.arraycopy(arr, 0, newArr, 0, pos - 1);
        newArr[pos - 1] = value;
        System.arraycopy(arr, pos - 1, newArr, pos, n - (pos - 1));
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        arr = insertAtBeginning(arr, 6);
        System.out.println("After inserting 6 at the beginning: " + Arrays.toString(arr));

        arr = insertAtEnd(arr, 7);
        System.out.println("After inserting 7 at the end: " + Arrays.toString(arr));

        arr = insertAtPosition(arr, 8, 4);
        System.out.println("After inserting 8 at position 4: " + Arrays.toString(arr));
    }
}
