// Fibonnaci code in java

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
// Output: Fibonacci of 10 is: 55
// Time Complexity: O(2^N)
// Space Complexity: O(N)
// Stable: Yes
// In-Place: No
// When to use: When you need a simple implementation of Fibonacci sequence
// Applications: Used in many programming languages libraries to demonstrate recursion