//5. Write a program to read text from .txt file using FileReader
package Day15.package1;
import java.io.FileReader;
import java.io.IOException;
public class IOClass5 {
    public static void main(String[] args){
        String path="src/Day15/file5.txt";
        try{
            FileReader f_read=new FileReader(path);
            int i;
            while ((i=f_read.read())!=-1)
            {
                System.out.print((char)i);
            }
            }catch (IOException e){
            e.printStackTrace();
        }
    }

}
