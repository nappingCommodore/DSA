import java.util.Arrays;

// Quick Sort code in java
// Time Complexity: O(NlogN) in average case, O(N^2) in worst case
// Space Complexity: O(logN) in average case, O(N) in worst case
// Stable: No
// In-Place: Yes
// When to use: When you need an in-place sort and you don't care about worst case time complexity
// Applications: Used in many programming languages libraries to sort arrays

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 6, 3};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, high);
        
        return i + 1;
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

