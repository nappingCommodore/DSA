import java.util.Arrays;

// Rotate an array

public class RotateArray {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k is greater than array length
        
        // Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        rotate(arr, k);
        
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}