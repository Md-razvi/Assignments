package Day10;
//9.  Create a PRIVATE or PROTECTED interface and print the values as above scenario
//10. Create an interface with private, public and protected fields.
//11. Create an interface with static final variable
//Protected Interface (by default)
interface inter_09{
    int a=84;
    static final int d=32;
//    private static int b=32; error
//    protected static int  c=22;

    void Method1();
}
public class Interface_09 implements inter_09 {
    @Override
    public void Method1() {
        System.out.println("This is a protected method");

    }
    public static void main(String[] args){
//        Interface_09 obj=new Interface_09();
    System.out.println(Interface_09.a);
    System.out.println(d);
    }
}
//All fields in an interface are public static final (constants).
//All methods in an interface are public by default.
//Interfaces cannot have private or protected members.
//From Java 8, interfaces can have default and static methods (with bodies).