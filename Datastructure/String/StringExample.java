// Example of string creation and use
public class StringExample {
    public static void main(String[] args) {
        // create a string
        String str = "Hello, World!";
        // print the string
        System.out.println(str);
        // create a string using the new keyword
        String str2 = new String("Hello, World!");
        // print the string
        System.out.println(str2);
    }
}

// Example of different string methods 
public class StringExample {
    public static void main(String[] args) {
        // create a string
        String str = "Hello, World!";
        // print the string
        System.out.println(str);
        // get the length of the string
        System.out.println("The length of the string is: " + str.length());
        // get the index of a character
        System.out.println("The index of the character 'o' is: " + str.indexOf('o'));
        // get the substring of the string
        System.out.println("The substring of the string is: " + str.substring(7, 12));
        // convert the string to uppercase
        System.out.println("The string in uppercase is: " + str.toUpperCase());
        // convert the string to lowercase
        System.out.println("The string in lowercase is: " + str.toLowerCase());
    }
}