import java.util.Arrays;

// Given an array of distinct elements, find the third largest element in it.
public class ThirdLargestElement {
    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array should have at least 3 elements");
        }
        
        Arrays.sort(arr);
        
        return arr[arr.length - 3];
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 9};
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element: " + thirdLargest);
    }
}
