package Day04;
import java.util.Arrays;
import java.util.Scanner;
public class AddingElement {
    public static void main(String[] args){
        int[] a={12,45,67,78,95,6,78};
        System.out.println("Give an array "+Arrays.toString(a)+" of size "+a.length);
        System.out.println("Now enter an index  within size of "+a.length);
        Scanner obj=new Scanner(System.in);
        int index=obj.nextInt();
        System.out.println("Now enter the value");
        int value=obj.nextInt();
        int[] updatedArr=addedArr(a,index,value);
        System.out.println("updated Array"+Arrays.toString(updatedArr));
    }
    static int[] addedArr(int[] arr,int index,int value){
        //Update the size of arr and initiailize a new arr;
        int[] arr1=new int[arr.length+1];
        for(int i=0,j=0;i<arr1.length;i++)
        {
         if(i!=index)
         {
             arr1[i]=arr[j];
             j++;
         }else{
             arr1[i]=value;
         }

        }
       return arr1;

    }
}
