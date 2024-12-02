//8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
//   Implement this interface to some class and print the values of the interface fields and call the interface methods
package Day10;
public class InterClass_08 implements Interface8 {
    @Override
    public void AssignedMethod() {
        System.out.println("This is a Defined method");
    }
    public static void main(String[] args){
        Interface8 obj;
        //Since values are static we can directly access either using Directly
        System.out.println(assignedvalue);
        obj=new InterClass_08();
        obj.AssignedMethod();

    }
}
