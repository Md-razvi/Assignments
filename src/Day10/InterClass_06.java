//6. Create an interface with a default method and implement it in a class.
// Do not provide implementation to the default method and call the method.
package Day10;
interface MyInterface{
    //Default  method
    default void Method(){
        System.out.println("This is a predefined");
    }
}
class DefaultClass implements MyInterface{
    //No methods of is implemented here since it is already predefined
}
class InterClass_06  {
    public static void main(String[] args){
        MyInterface obj;
        obj=new DefaultClass();
        obj.Method();
    }
}
