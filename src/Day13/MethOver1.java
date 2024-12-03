//Write two methods with the same name but different number of parameters of same type and call the methods from main method
package Day13;
public class MethOver1 {
    public static int  Add(int x,int y){
        return x+y;
    }
    public static int Add(int x){
        return ++x;
    }
    public static void main(String[] args){
        System.out.println("Value of Overload Method1 "+Add(5,4));
        System.out.println("Value of Overload Method2 "+Add(5));

    }

}
