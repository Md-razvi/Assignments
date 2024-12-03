package Day02;
import java.util.Scanner;
//Write a program to find the two numbers equal or not.
public class EqualCondition
{
    public static void main(String[] args) {
        String result;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the given number a & b");
        int a= obj1.nextInt();
        int b= obj1.nextInt();
        result=(a==b)?"a is equal to b":"a is not equal to b";
        System.out.println((result));
    }

}
