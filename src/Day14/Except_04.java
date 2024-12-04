//4. Write a program with multiple catch blocks
//5. Write a program to throw exception with your own message
//9. Write a program to generate ArrayIndexOutOfBoundException
package Day14;
public class Except_04 {
    public static void main(String[] args){
        try{
            int [] numbers={1,2,3};
//          9)Ans  generating Array index out of Bound exeption
            System.out.println(numbers[5]);
        }
        //4 Ans)
        catch (ArithmeticException e){
            //5 Ans)
            System.out.println("Error:this is a arthematic error");
            e.getStackTrace();
        }catch (ArrayIndexOutOfBoundsException s){
            System.out.println("Error: Array index is out of bounds!");
            s.getStackTrace();
        }catch (Exception e) { // General exception handler (optional, should be the last)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
