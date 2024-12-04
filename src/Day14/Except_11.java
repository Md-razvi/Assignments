//11. Write a program to generate FileNotFoundException
package Day14;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class Except_11 {
    public static void main(String[] args) {
        try {
            // Attempt to read a non-existent file
            File file = new File("nonexistentfile.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            // Handle the exception
            System.out.println("FileNotFoundException caught!");
            System.out.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}