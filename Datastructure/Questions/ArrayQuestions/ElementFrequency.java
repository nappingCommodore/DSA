import java.util.Scanner;

// Code to get the frequency of a given element in an array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to find its frequency
        System.out.print("Enter the element to find its frequency: ");
        int element = scanner.nextInt();

        // Calculate the frequency
        int frequency = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                frequency++;
            }
        }

        // Print the frequency
        System.out.println("Frequency of " + element + " is " + frequency);

        scanner.close();
    }
}
