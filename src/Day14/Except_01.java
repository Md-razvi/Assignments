//1. Write a program to generate Arithmetic Exception without exception handling
//8. Write a program to generate Arithmetic Exception
package Day14;
public class Except_01 {
    public static void main(String[] args) {
        System.out.println("Before modulo operation");

        // This will cause an ArithmeticException (modulo by zero)
        int result = 10 % 0;

        System.out.println("This line will not be executed");
        System.out.println("Result: " + result);
    }
}
