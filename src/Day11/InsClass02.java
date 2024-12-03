//Print the fields/instance members of the parent class using super
package Day11;
class Parentclass{
    String car="bike";
    void Access1(){
        System.out.println("Father can access "+car);
    }
}
class ChildClass extends Parentclass{
    @Override
    void Access1() {
        System.out.println("Child can access this "+super.car);
    }
}
public class InsClass02 {
    public static void main(String[] args){
        ChildClass child=new ChildClass();
        child.Access1();
    }
}
