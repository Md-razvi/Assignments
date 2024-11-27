//Print all the static, instance variables in main method
package Day5;
public class staticAndInstanceVar {
    public static void main(String[] args){
        StatAndInstVar obj1=new StatAndInstVar();
        System.out.println(obj1.a);//Printing instance variables
        System.out.println(StatAndInstVar.b);//Printing static variables
    }
}
class StatAndInstVar{
    int a=12; //instances variables
    static int b=32; //static variables

}
