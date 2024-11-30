package Day8;

public class publicMethod {
    public static void main(String[] args){
    PublicClass obj1=new PublicClass();
    //public accessifiers can be directly accessed and changed;
    obj1.a=45;
    System.out.println(obj1.a);
    obj1.method();
    }
}
