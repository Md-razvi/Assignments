//12. Write a program to generate IOException
package Day14;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Except_12 {
public static void main(String[] args)throws IOException{
            // File object for a non-existent file
    try {
        File file = new File("non_existent_file.txt");
        // Trying to read the file
        FileReader fileReader = new FileReader(file);
    }
    catch (Exception e){
        System.out.println(e);
//        System.out.println("This line will not be executed.");
    }
        }
    }


