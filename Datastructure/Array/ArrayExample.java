//An example of Array create and use 
public class ArrayExample {
    public static void main(String[] args) {
        // create an array of integers
        int[] numbers = new int[5];
        // assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // print the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
