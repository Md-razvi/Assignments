package Day3;
import java.util.Scanner;
public class Gender {
    public static void main(String[] args){
        System.out.println("Enter a character check your gender ");
        Scanner obj=new Scanner(System.in);
        char gen=obj.next().charAt(0);
        checkGender(gen);
    }
    static void checkGender(char gen)
    {
        switch(gen){
            case 'M':
                System.out.println("The person is male");
                break;
            case 'F':
                System.out.println("The person is female");
                break;
            default:
                System.out.println("Please enter your correct choice");
                break;
        }
    }

}
