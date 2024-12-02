//Create an abstract class with abstract and non-abstract methods.
package Day9;

//import java.lang.reflect.Method;

import java.lang.reflect.Member;

abstract  class AbsClass{
    public abstract void Method1();
    public void Method2(){
        System.out.println("This is a Method defined in Abstract Class");
    }
}
class DerivedClass extends AbsClass{
    @Override
    public void Method1() {
        System.out.println("This is a Abstract Method ");
    }
}
public class abstract_01{
    public static void main(String[] args){
        DerivedClass obj1=new DerivedClass();
        obj1.Method1();
        obj1.Method2();
    }
}
