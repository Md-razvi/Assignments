//7. Write a program with finally block
package Day14;
public class Except_07 {
    public static void main(String[] args){
        try{
            int[] arr={12,34,56,67};
            System.out.println(arr[5]);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This blocks runs regardless of whether there is an error or not");
        }

    }
}
