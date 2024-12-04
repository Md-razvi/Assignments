//17. Write a program to generate StringIndexOutOfBoundsException
package Day14;
public class Except_17 {
    public static void main(String[] args) {
        try {
            // Define a sample string
            String sample = "Hello, World!";

            // Attempt to access an index beyond the string's length
            char character = sample.charAt(20);

            // This line will not execute because the exception will be thrown
            System.out.println("Character at index 20: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException
            System.err.println("StringIndexOutOfBoundsException caught! How is this possible");
            System.err.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
