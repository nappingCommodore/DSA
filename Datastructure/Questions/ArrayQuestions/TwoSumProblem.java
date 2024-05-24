// Two Sum problem: Check if a pair with given sum exists in Array

public class TwoSumProblem {
    public static boolean hasPairWithSum(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 15};
        int targetSum = 9;
        boolean hasPair = hasPairWithSum(arr, targetSum);
        System.out.println("Pair with sum " + targetSum + " exists: " + hasPair);
    }
}
