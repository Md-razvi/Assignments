//Write a class with a default constructor, one argument constructor and two argument constructors.
//Instantiate the class to call all the constructors of that class from a main class
package Day12;
class Const {
    //Default constructor
    public Const() {
        System.out.println("This is a default constructor");
    }
    //one argument constructor
    public Const(int a) {
        System.out.println("The value is " + a);
    }
    //two argument constructors
    public Const(int a, int b) {
        System.out.println("The values are "+ a + " " + b);
    }
}
public class Const_01 {
    public static void main(String[] args) {
        Const obj1 = new Const();
        Const obj2 = new Const(12);
        Const obj3 = new Const(12, 34);
    }
}
