//2. Call the constructors (both default and argument constructors) of super class from a child class
package Day12;
class  Const_2{
    public Const_2() {
        System.out.println(" ");
        System.out.println("This is a default Constructor ");
    }
    public Const_2(int a,int b){
        System.out.println(" ");
        System.out.printf("This are values %d %d \n", a, b);
    }
}
class Const_3 extends Const_2 {
 Const_3(){
     super();
     System.out.println("This is in Child Constructor");

 }
 Const_3(int a,int b){
     super(a,b);
     System.out.println("This is in Child Constructor");
 }
}
public class Const_02 {
    public static void main(String[] args){
     Const_3 obj=new Const_3();
     Const_3 obj1=new Const_3(12,34);


    }

}
