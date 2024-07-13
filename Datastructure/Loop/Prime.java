// print all prime numbers betwen 2 to n
import java.util.Scanner;

public class Prime {
    public static void isPrime(int n) {
        int flag = 0;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i == 0) {
                flag = 1;
                System.out.println(n + " is not a prime number");
                break;
            }
        }
        if(flag == 0) {
            System.out.println(n + " is a prime number");
        }
    }
    public static void main(String args[]) {
        System.out.print("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int n = 15;
        if(n <= 1) {
            System.out.println(n + " is not a prime number");
        }
        for(int i=2;i<=n; i++)
            Prime.isPrime(i);
    }
}


