package Day08;
class privateExamp{
    private String name="Private John";
    private int age=32;
    private void Message(){
        System.out.println("This is a private method");
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void FunctionCall(){
        Message();
    }
}
class subClass extends privateExamp{
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getAge(){
        return super.getAge();
    }

}
public class privClass {
    public static void main(String[] args){
        privateExamp ob1=new privateExamp();
        System.out.println("This is from main class "+ob1.getName());
        System.out.println("This is from main class "+ob1.getAge());
        ob1.FunctionCall();
        subClass ob2=new subClass();
        System.out.println("This is from sub class "+ob2.getAge());
        System.out.println("This is from sub class "+ob2.getName());


    }
}
