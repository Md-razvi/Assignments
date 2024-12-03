//3. Apply private, public, protected and default access modifiers to the constructor
//4. Write constructors with return type int and String
//5. Try to call the constructor multiple times with the same object
package Day12;
class AccessConst{
    int a,b;
    String str,str2;
    public AccessConst(){
        this("words1");
        System.out.println("This is a default constructor");
        }
    protected AccessConst(String str){
        this(23,35);
        this.str=str;
        System.out.println("This is a str of "+this.str);
    }
    private AccessConst(int a,int b){
        this.a=a;
        this.b=b;
        System.out.printf("The given values are %d and %d\n",a,b);
    }
//Note:There is no return type for Constructor
}
public class Const_03 {
    public static void main(String[] args){
        AccessConst words=new AccessConst();
    }
}
