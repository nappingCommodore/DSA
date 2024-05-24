// Merge two sorted arrays without using extra space

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
        for (int i = n - 1; i >= 0; i--) {
            int j, last = arr2[m - 1];
            for (j = m - 2; j >= 0 && arr2[j] > arr1[i]; j--) {
                arr2[j + 1] = arr2[j];
            }
            if (j != m - 2 || last > arr1[i]) {
                arr2[j + 1] = arr1[i];
                arr1[i] = last;
            }
        }
    }
}
