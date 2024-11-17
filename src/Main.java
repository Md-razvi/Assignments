import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the given two numbers and sign\n");
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2= new Scanner(System.in);
        Double num1,num2;
        int a;
        num1= obj1.nextDouble();
        num2= obj1.nextDouble();
        //a=obj2.nex
        System.out.println("Enter the your choice");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        a=obj2.nextInt();
        switch(a){
            case 1:
                System.out.println("The value is "+(num1+num2));
                break;
            case 2:
                System.out.println("The value is "+(num1-num2));
                break;
            case 3:
                System.out.println("The value is "+(num1*num2));
                break;
            case 4:
                System.out.println("The value is "+(num1/num2));
                break;
            default:
                System.out.println("Please give a correct choice ");
                break;

        }



    }
}