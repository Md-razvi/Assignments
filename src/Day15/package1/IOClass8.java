//Write text to a .txt file using BufferedWriter
package Day15.package1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class IOClass8 {
    public static void main(String[] args) {
        String path = "src/Day15/file8.txt"; // Specify the file path
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the content you want to write to the file (type 'exit' to finish):");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String line;
            while (true) {
                line = scanner.nextLine(); // Read user input line by line
                if (line.equalsIgnoreCase("exit")) { // Stop when the user types "exit"
                    break;
                }
                writer.write(line); // Write the line to the file
                writer.newLine(); // Add a new line after each line
            }
            System.out.println("File written successfully by IOClass8!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace(); // Optional: Print stack trace for debugging
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
