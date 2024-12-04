//10.  Write a program to generate ClassNotFoundException
package Day14;
public class Except_10 {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Handle the exception
            System.out.println("ClassNotFoundException caught!");
            System.out.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
