//6. Write a program to write text to .txt file using FileWriter
package Day15.package1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class IOClass6 {
    public static void main(String[] args) {
        String path = "src/Day15/file6.txt"; // Specify the file path
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the content you want to write to the file:");
        String content = scanner.nextLine(); // Capture user input

        // Using try-with-resources to ensure proper resource handling
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content); // Write user input to the file
            System.out.println("File written successfully by IOClass7!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace(); // Optional: Print stack trace for debugging
        }
    }
}
