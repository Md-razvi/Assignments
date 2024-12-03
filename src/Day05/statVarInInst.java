//Print Static in Instance
package Day05;
class PrintStatic{
    static int var=20;
    void ShowNum(){
        System.out.println(var);
    }
}
public class statVarInInst {

    public static void main(String[] args){
        PrintStatic obj=new PrintStatic();
        obj.ShowNum();

    }
}
