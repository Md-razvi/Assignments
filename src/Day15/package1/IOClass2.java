//2. Write a program to write text to .txt file using OutputStream
package Day15.package1;
import java.io.FileOutputStream;
import java.util.Scanner;

class IOClass2 {
    public static void main(String[] args) {
        try {
            // Specify file path
            FileOutputStream f_write = new FileOutputStream("src/Day15/file2.txt");
            // Create Scanner to read input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text to write to the file:");
            // Use nextLine() to read entire input including spaces
            String ab = scanner.nextLine();
            // Convert string to bytes and write to file
            byte convert[] = ab.getBytes();
            f_write.write(convert);
            System.out.println("Success: Text written to file.");
            f_write.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
