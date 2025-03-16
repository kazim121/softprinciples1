package withoutprinciple;

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Using Bubble Sort to sort the array
        bubbleSort(arr);
        
        // Printing the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
