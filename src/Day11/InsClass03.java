package Day11;
//3. Call constructor of the current class using this()
//4. Call argument constructor of current class using this()
class currentClass{
    int a;
    String name;
    public currentClass(){
        this("Aisha",32);
        System.out.println("this is default");
    }
    public currentClass(String name,int a){
        this.name=name;
        this.a=a;
        System.out.println("This is parameterized constructor with name "+this.name+" and age "+this.a);
    }
}
public class InsClass03 {
    public static void main(String[] args){
        currentClass obj=new currentClass();
    }
}
