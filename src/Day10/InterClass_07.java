//7. Create an interface and inherit it from the other interface.
package Day10;
interface inter1{
    void method1();
}
interface inter2 extends inter1{
    void method2();
}
class SecondInter implements inter1{
    @Override
    public void method1() {
        System.out.println("This is a method1 defined in this class implemented by iter2 ");
    }
}
class  ThirdInter implements inter2{
    @Override
    public void method1() {
        System.out.println("This is a method1 (defined here) inhetrited in inter 2 from inter1 and is implemented on this class");
    }

    @Override
    public void method2() {
    System.out.println("This is a method2 of inter 2 defined in this class");
    }
}
class InterClass_07 {
 public static void main(String[] args){
    inter2 obj;
    obj=new ThirdInter();
    obj.method1();
 }
}
