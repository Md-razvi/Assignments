//7. Read text from a .txt file using BufferedReader
package Day15.package1;
import java.io.BufferedReader;
import java.io.FileReader;
public class IOClass7 {
    public static void main(String[] args)
    {
        String path = "src/Day15/file6.txt";
        try {
            FileReader f1_reader = new FileReader(path);
            BufferedReader bufferread = new BufferedReader(f1_reader);
            int i;
            while ((i=bufferread.read())!=-1){
                System.out.print((char)i);
            }
            bufferread.close();
            f1_reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}