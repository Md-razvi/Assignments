//1. Print the fields/instance members of the current class using this and without using object
package Day11;
class ThisField{
     String name;
     int age;
    public ThisField(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("This is "+this.name);
        System.out.println("This persons age is "+this.age);
    }

}
public class InsClass {
    public static void main(String[] args){
        ThisField f2=new ThisField("Ashish",32);


    }
}
