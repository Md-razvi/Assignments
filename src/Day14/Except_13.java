//13. Write a program to generate NoSuchFieldException

package Day14;
import java.lang.reflect.Field;
public class Except_13 {
    public static void main(String[] args) {
        try {
            // Accessing the Class object of a sample class
            Class<SampleClass> clazz = SampleClass.class;

            // Attempting to access a non-existent field
            Field field = clazz.getDeclaredField("age"); // This will throw NoSuchFieldException
            System.out.println("Field name: " + field.getName());

        } catch (NoSuchFieldException e) {
            System.out.println("Error: The specified field does not exist!");
        }
    }
}

// Sample class with no 'nonExistentField'
class SampleClass {
    private int id;
    private String name;
}
