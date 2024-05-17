//Example of functions in java
public class Function {
    // Function with no return type
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Function with return type
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        System.out.println("Sum: " + add(5, 3));
    }
}
