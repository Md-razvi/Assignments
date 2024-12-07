//1. Write a program to read text from .txt file using InputStream
package Day15.package1;
import java.io.*;
class IOClass1{
    public static void main(String[] args) {
        File file = new File(
                "src/Day15/file1.txt");
        try (FileInputStream input=new FileInputStream(file)){
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
            // Closes the input stream

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
