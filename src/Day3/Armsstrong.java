package Day3;
import java.util.Scanner;
public class Armsstrong {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        boolean res=isArmStrong(a);
        if(res)
        {
            System.out.println("Is Armstrong number");
        }
        else{
            System.out.println("Is not a Armstrong number");
        }

    }
    static boolean isArmStrong(int a)
    {
        int result=a;
        double j=0;
        while(a>0)
        {
            int rem;
            rem=a%10;
            j=Math.pow(rem,3)+j;
            a=a/10;
        }
        int b=(int)j;
        if(result==b){
            return true;
        }
        return  false;
    }
}
