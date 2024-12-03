package Day02;
import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args){
        System.out.print("Enter the numbers");
        Scanner ab=new Scanner(System.in);
        int a=ab.nextInt();
        int b=ab.nextInt();
        int min=a<b?a:b;
        int max=a>b?a:b;
        System.out.println("The max number is "+max);
        System.out.println("The min number is "+min);

    }
}
