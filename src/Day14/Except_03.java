//3. Write a method which throws exception, Call that method in main class without try block
package Day14;
public class Except_03 {
    public static void CheckAge(int age){
        if(age<18)
        {
            throw new RuntimeException("The person is under aged please enter greater value");
        }else{
            System.out.println("Ok");
        }
    }
    public static void main(String[] args){
        CheckAge(22);
    }
}
