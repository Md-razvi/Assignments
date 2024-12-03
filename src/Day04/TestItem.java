//Write a function to test if array contains a specific value
package Day04;
import java.util.Scanner;
public class TestItem {
public static void main(String[] args){
int[] arr={12,34,45,59,22};
boolean isTrue;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the specific element");
int el=obj.nextInt();
isTrue=isElementPresent(arr,el);
if(isTrue)
{
    System.out.println("Yes it is present");
}else{
    System.out.println("No it is not present");
}

}
static boolean isElementPresent(int[] arr,int element)
{
    boolean b=false;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==element)
        {
            b=true;
            break;
        }
    }
    return b;
}

}
