//Example of nested for loop

public class NestedForLoop {
    public static void main(String[] args) {
        // create a 2D array
        int n = 10;
        int m = 20;
        int[][] numbers = new int[][]{
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        // print the array
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Adding new line after each row
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" Hello Gradious "); // Adding new line after each row
        }
    }
}

1 2 3
4 5 6
7 8 9