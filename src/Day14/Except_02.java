//2. Handle the Arithmetic exception using try-catch block
//8. Write a program to generate Arithmetic Exception
package Day14;
public class Except_02 {
    public static void main(String[] args) {
//        System.out.println("Before modulo operation");
        try{
            int result = 10 % 0;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e) {

            System.out.println(e.getMessage());
//            System.out.println("Error: Division by zero is not allowed!");
//            System.out.println("Result: " + result);
        }
        // This will cause an ArithmeticException (modulo by zero)



    }
}
