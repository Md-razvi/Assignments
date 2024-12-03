//5. Call constructor of the parent class using super()
package Day11;
class Parent_Class{
    int a,b;
     public Parent_Class(int a,int b){
         this.a=a;
         this.b=b;
        System.out.println("These are values "+a+' '+b);
    }
}
class child extends Parent_Class{
    public child(){
        super(12,15);
        System.out.println("This is a class");
    }
}
public class InsClass05 {
  public static void main(String[] args){
      child obj1=new child();

  }
}
