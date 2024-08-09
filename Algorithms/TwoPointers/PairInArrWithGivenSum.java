// Find if There is a Pair in A[0..N-1] with Given Sum using 2 pointers approach

import java.util.Arrays;

public class PairInArrWithGivenSum {
    public static void main(String[] args) {
        int[] A = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        System.out.println("Array: " + Arrays.toString(A));
        System.out.println("Sum: " + sum);
        System.out.println("Pair Exists: " + isPairWithGivenSum(A, sum));
    }

    // Function to find if there is a pair in A[0..N-1] with given sum
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    private static boolean isPairWithGivenSum(int[] A, int sum) {
        int left = 0, right = A.length - 1;
        Arrays.sort(A);
        while (left < right) {
            if (A[left] + A[right] == sum) {
                return true;
            } else if (A[left] + A[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}