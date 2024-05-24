//Move all zeros to the beginning

public class MoveZeroAtBegin {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = moveZerosToBegin(arr);
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] moveZerosToBegin(int[] arr) {
        int n = arr.length;
        int count = 0;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int j=0;
        while (count > 0) {
            result[j++] = 0;
            count--;
        }

        for (int i=0; i < n && j < n; i++) {
            if (arr[i] != 0) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}
