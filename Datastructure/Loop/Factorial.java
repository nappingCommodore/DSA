// Factorial iterative coede in java

public class Factorial {
    public static int factorial(int n) {
        int _factorial = 1;
        for(int i=1; i<=n ; i++) {
            _factorial = _factorial*i;
        }
        return _factorial;
    }
    public static void main(String args[]) {
        // Factorial fact = new Factorial();
        System.out.println(Factorial.factorial(5));
    }
}
