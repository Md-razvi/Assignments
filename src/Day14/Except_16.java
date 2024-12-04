//16. Write a program to generate NumberFormatException
package Day14;
public class Except_16 {
    public static void main(String[] args) {
        try {
            // A string that cannot be converted to a number
            String invalidNumber = "ABC123";

            // Attempt to parse the invalid string as an integer
            int number = Integer.parseInt(invalidNumber);

            // This line will not execute because the exception will be thrown
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.err.println("NumberFormatException caught!");
            System.err.println("Error message: this is a error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
