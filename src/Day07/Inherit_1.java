package Day07;
//Create a class with main method. Create an object for each class A1, B1 and C1 in main method and call every method of each class using its own object/instance.
class A1{
    int a=7;
}
class B1{
    int b=56;
}
class  C1{
    int c=32;
}
public class Inherit_1 {
    public static void main(String[] args){
        A1 obj1=new A1();
        System.out.println(obj1.a);
        B1 obj2= new B1();
        System.out.println(obj2.b);
        C1 obj3=new C1();
        System.out.println(obj3.c);
        }

    }


