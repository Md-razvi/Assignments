//4. Write text to a .txt file using BufferedOutputStream
package Day15.package1;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class IOClass4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to write: ");
        String textToWrite = scanner.nextLine();
        String fileName = "src/Day15/file4.txt";

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(textToWrite.getBytes());
            bos.flush(); // Ensure all data is written to the file

            System.out.println("Text written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}