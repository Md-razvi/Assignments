package Day4;
import java.util.Scanner;
//Write a program to find the index of an array element
public class IndexArr {
public static void main(String[] args){
    int[] arr={12,15,10,9,8};
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the element  of an array");
    int a=obj.nextInt();
    int res=isThereOrNot(arr,a);
    if(res==-1){
        System.out.println("No element is found");
    }
    else {
        System.out.println("The index of element "+res);
    }

}
static int  isThereOrNot(int[] arr,int a)
{
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==a)
        {
            return i;
        }

    }
 return -1;
}
}
