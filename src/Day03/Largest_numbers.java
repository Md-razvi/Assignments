package Day03;
import java.util.Scanner;
public class Largest_numbers {
    public static void main(String[] args)
    {
        System.out.println("enter 3 numbers");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        int max=a>b?a:b;
        int max2=max>c?max:c;
        System.out.println("The largest of the 3 is "+max2);
    }
}
