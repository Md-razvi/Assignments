//3. Read text from a .txt file using BufferedInputStream
package Day15.package1;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOClass3 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "src/Day15/file3.txt";

        // Use try-catch block to handle exceptions
        try {
            // Create FileInputStream and wrap it with BufferedInputStream
            FileInputStream fileInputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            System.out.println("Reading file content:");
            int byteData;
            StringBuilder line = new StringBuilder();

            // Read the file byte by byte
            while ((byteData = bufferedInputStream.read()) != -1) {
                char currentChar = (char) byteData;

                // Handle newline characters to detect line breaks
                if (currentChar == '\n') {
                    System.out.println(line.toString()); // Print the current line
                    line.setLength(0); // Clear the StringBuilder for the next line
                } else if (currentChar != '\r') { // Ignore carriage returns
                    line.append(currentChar);
                }
            }
            // Print the last line if the file doesn't end with a newline
            if (line.length() > 0) {
                System.out.println(line.toString());
            }

            // Close the streams
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            // Handle any IOException that occurs during file reading
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
