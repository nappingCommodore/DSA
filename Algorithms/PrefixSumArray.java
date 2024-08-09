// Java Program for Implementing prefix sum arrayclass

import java.util.Arrays;
import java.util.Arrays;

// Java Program for Implementing prefix sum array


public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefixSum));
    }
}