package Day1;

public class GlobalAndLocal {
    public static void main(String[] args)
    {
        // Define the local and Global variables with the same name and print both variables and understand the scope of the variables
        Person obj1=new Person();
        obj1.PrintName();
    }
}
class Person{
    //Global variable
    String name="Madhav";
    public void PrintName(){
        String name="Anna";
        System.out.println("This is a local name "+name);
        System.out.println("This is a global name "+this.name);
    }

}
