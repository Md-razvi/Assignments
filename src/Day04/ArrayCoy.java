package Day04;
import java.util.Arrays;
public class ArrayCoy {
    public static void main(String[] args){
        // Asimple array;
        int[] a={12,34,45,78};
        int [] c={34,45,66,89};
        int[]b=CopiedArray(a);
        System.out.println(Arrays.toString(b));
        //Updating b;
        b[2]=67;
        System.out.println(Arrays.toString(b));
        //O/p in the a is also same considering these is an array so
        System.out.println(Arrays.toString(a));
        int [] d=dupicateArray(c);
        //Updating original array
        c[2]=99;
        System.out.println("Updated Arrays "+Arrays.toString(c));
        System.out.println("Duplicate Arrays "+Arrays.toString(d));


    }
    static int [] CopiedArray(int[] arr)
    {
        // here the concept of referancing comes since array and objects are not variabe so they are not copied but referenced to a their respective memories
        int[] a=arr;
        return a;
    }
    static int [] dupicateArray(int [] arr)
    {
        // A new array is initialised with the length of the original array;
        int[] a=new int [arr.length];
        //All the values are now stored in new array with help of for loop
//      Hence it is completed different from original array and
        for (int i=0;i<a.length;i++)
        {
            a[i]=arr[i];
        }
        return a;
    }
}
