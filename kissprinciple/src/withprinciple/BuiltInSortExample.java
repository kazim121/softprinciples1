package withprinciple;

import java.util.Arrays;

public class BuiltInSortExample {
    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Using Java's built-in Arrays.sort() to sort the array
        Arrays.sort(arr);
        
        // Printing the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
