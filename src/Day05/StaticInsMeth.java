//Call static methods and instance methods in main method
package Day05;
public class StaticInsMeth {
    public static void main(String[] args)
    {
        StaticInsMeth ob1=new StaticInsMeth();
        StatMeth(); //Static method in main;
        ob1.InstMeth();//Instance method in main;

    }
    static void StatMeth(){
        System.out.println("This is a static method");
    }
    void InstMeth(){
        System.out.println("This is a inst method");
    }
}
