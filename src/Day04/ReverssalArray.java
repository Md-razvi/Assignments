package Day04;
import java.util.Arrays;
public class ReverssalArray {
    public static void main(String[] args)
    {
        int[] arr={12,34,5,6,90,91,101,89};
        System.out.println("The orginal is arr "+Arrays.toString(arr));
        int[] arr1=ReverseArr(arr);
        System.out.println("The reversal of arr "+Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr1));
    }
    static int[] ReverseArr(int[] abc){
        int[] arr=new int [abc.length];
        int i=0,j=arr.length-1;
        while(i<arr.length&&j>=0){
            arr[i]=abc[j];
            i++;
            j--;
        }
        return arr;
    }
}
