//An example of Array create and use 
// public class ArrayExample {
//     public static void main(String[] args) {
//         // create an array of integers
//         int[] numbers = new int[5];
//         // assign values to the array
//         numbers[0] = 10;
//         numbers[1] = 20;
//         numbers[2] = 30;
//         numbers[3] = 40;
//         numbers[4] = 50;
//         // print the array
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
//     }
// }

// Example of different types of array initialization
public class ArrayExample {
    public static void main(String[] args) {
        // create an array of integers
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        // print the array
        System.out.println("Array of integers Format 1:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // create an array of integers using the new keyword
        int[] numbers2 = new int[5];
        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
        numbers2[4] = 50;
        int[] arr = {0, 0, 1, 1, 1};
        //Array insertion for new element (6th element)
        int[] numbers3 = new int[6];
        // numbers3[0] = numbers2[0];
        // numbers3[1] = numbers2[0];
        // numbers3[2] = numbers2[0];
        // numbers3[3] = numbers2[0];
        // numbers3[4] = numbers2[0];
        for(int i=0; i<numbers2.length; i++){
            numbers3[i] = numbers2[i];
        }
        numbers3[5] = 60; //insertion of new element
        // print the array
        System.out.println("Array of integers Format 2:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}


