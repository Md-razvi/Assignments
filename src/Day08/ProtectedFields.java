package Day08;

public class ProtectedFields {
    protected String name;
    protected void Method(){
        System.out.println("This is a protected method");
    }
}
class Protected_03{
    public static void main(String[] args){
        ProtectedFields obj1=new ProtectedFields();
        obj1.name="Protected Filed";
        obj1.Method();
    }
}
