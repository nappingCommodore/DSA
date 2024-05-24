//Move all zeros to the beginning/end of an array

public class MoveZeroAtBegin {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToBegin(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveZerosToBegin(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }
}
