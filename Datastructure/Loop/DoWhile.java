import java.util.Scanner;

public class DoWhile{
    public static void main(String args[]) {
        String ch;
        do {
            System.out.print("Enter the number: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            System.out.print("Do you want to enter another number (Y/N) ");
            ch = scan.next();

            if(ch.charAt(0) == 'Y') {
                System.out.print("User wants to enter another number");
            } else if(ch.charAt(0) == 'N') {
                System.out.print("User doesn't want to enter another number");
            }
        } while(ch.charAt(0) != 'N');
        System.out.println("Outside of loop");      
    }
}