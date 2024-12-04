//15. Write a program to generate NullPointerException
package Day14;
public class Except_15 {
    public static void main(String[] args) {
        try {
            // Create a reference and assign it to null
            String nullString = null;

            // Attempt to call a method on the null reference
            System.out.println(nullString.length());
        } catch (NullPointerException e) {
            // Handle the NullPointerException
            System.err.println("NullPointerException caught! Woe");
            System.err.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
