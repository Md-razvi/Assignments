//1. Create an interface with only one method and implement it in a class. Call the method implemented.
package Day10;
interface  Inter_1{
    void Method1();
}
 class InterClass1 implements Inter_1{
    @Override
    public void Method1(){
        System.out.println("This is a first Method of  defined in Inter_1 Class");
    }
}
class Inter_Class1{
    public static void main(String[] args){
        Inter_1 obj;
        obj =new InterClass1();
        obj.Method1();
    }


}

