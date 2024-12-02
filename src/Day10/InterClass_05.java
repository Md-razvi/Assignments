//5. Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method.
package Day10;
interface A{
    void sameMethod();
}
interface B{
    void sameMethod();
}
public class InterClass_05 implements A,B {
    @Override
    public void sameMethod() {
        System.out.println("This is a method in both A,B");
    }
    public static void main(String[] args){
        InterClass_05 obj1=new InterClass_05();
        obj1.sameMethod();

    }
}
