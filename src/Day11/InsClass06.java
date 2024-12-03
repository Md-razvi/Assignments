//6. Call constructor of the parent class using super()
package Day11;
class Parent_1{
    void Method1(){
        System.out.println(" ");
        System.out.println("This is a parent1");
    }
    void Method_2(){
        this.Method1();
        System.out.println("This is instance Method using 'This' keyword ");
    }

}
class Child_1 extends Parent_1{
    void Method3(){
        super.Method1();
        System.out.println("This is extracted in Child class");

    }
}
public class InsClass06 {
 public static void main(String[] args){
    Child_1 abc=new Child_1();
    abc.Method3();
    abc.Method_2();
 }
}
