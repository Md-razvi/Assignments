package Day05;

public class staticInInstances {
    public static void main(String[] args){
        staticInInstances obj1=new staticInInstances();
        obj1.instanceMethod();
    }
    static void staticMethod(){
        System.out.println("This is a static method");
    }
    public void instanceMethod(){
        System.out.println("This is a instance method");
        staticMethod();
    }
}
