package Day03;
import java.util.Scanner;
public class OddAndEven {
    public static  void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        for (int i=1;i<a;i++){
           if(i==1)
           {
               System.out.println("Even number");
           }
           if(i%2==0) {
               System.out.print(i + " ");
           }
        }
        System.out.println(" ");
        for (int i=1;i<a;i++){
            if(i==1)
            {
                System.out.println("Odd number");
            }
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
