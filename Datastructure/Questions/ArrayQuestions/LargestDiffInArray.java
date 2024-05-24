import java.util.Arrays;

// Largest difference in array elements
public class LargestDiffInArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 2, 8, 6};
        
        int maxDiff = findLargestDifference(array);
        
        System.out.println("Largest difference: " + maxDiff);
    }
    
    public static int findLargestDifference(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        
        Arrays.sort(array);
        
        int maxDiff = array[array.length - 1] - array[0];
        
        return maxDiff;
    }
}
