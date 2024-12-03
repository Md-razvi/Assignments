package Day07;
class A{
 void methodA1(){
    System.out.println("This is a methodA1");
 }
 void methodA2(){
     System.out.println("This is a methodA2");
 }
 void CommonMethod(){
     System.out.println("This is a CommonMethod");
 }
}
class B extends A{
    void methodB1(){
    System.out.println("This is a B1 method");
    }
    void methodB2(){
        System.out.println("This is a B1");
    }
    @Override
    void CommonMethod(){
        System.out.println("This is a method Overridden: in class B");
    }
}
class C extends B{
    void methodC1(){
        System.out.println("This is a C1 emthod");
    }
    void methodC2(){
        System.out.println("This is a C2 method");
    }
    @Override
    void CommonMethod(){
        System.out.println("This is a Overridden : in class C");
    }
}
public class Inherit {
    public static void main(String[] args){
        A obj1=new A();
        obj1.methodA1();
        obj1.methodA2();
        obj1.CommonMethod();
        B obj2=new B();
        obj2.methodB1();
        obj2.methodB2();
        obj2.CommonMethod();
        C obj3=new C();
        obj3.methodC1();
        obj3.methodC2();
        obj3.CommonMethod();

    }
}
