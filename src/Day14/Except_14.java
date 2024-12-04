//14. Write a program to generate NoSuchMethodException
package Day14;
import java.lang.reflect.Method;

public class Except_14 {
    public static void main(String[] args) {
        try {
            // Accessing the Class object of a sample class
            Class<SampleClass1> clazz = SampleClass1.class;

            // Attempting to access a non-existent method
            Method method = clazz.getMethod("Method1"); // This will throw NoSuchMethodException
        } catch (NoSuchMethodException e) {
            System.err.println("NoSuchMethodException caught!");
            System.err.println("Error message: " + e.getMessage());
        }
    }
}

// Sample class with no 'Method1'
class SampleClass1 {
    private int id;
    private String name;
    public void existingMethod() {
        System.out.println("This method exists.");
    }
}
