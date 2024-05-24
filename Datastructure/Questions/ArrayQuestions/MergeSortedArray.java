// Merge two sorted arrays

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2);
        System.out.println("Merged array: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] finalArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                finalArray[k++] = arr1[i++];
            } else {
                finalArray[k++] = arr2[j++];
            }
        }

        while (i < n) {
            finalArray[k++] = arr1[i++];
        }

        while (j < m) {
            finalArray[k++] = arr2[j++];
        }

        // Copy the merged array back to arr1 and arr2
        for (int x = 0; x < n; x++) {
            arr1[x] = finalArray[x];
        }

        for (int x = 0; x < m; x++) {
            arr2[x] = finalArray[n + x];
        }
    }
}
