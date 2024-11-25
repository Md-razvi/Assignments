package Day4;
import java.util.Arrays;
public class FindEvenOdd {
    public static void main(String[] args){
        int[] a={12,34,5,6,3,19,1,17};
        int[]b=OddAndEven(a);
        System.out.println("The number of even and odd in array is "+Arrays.toString(b));
    }
    static int[] OddAndEven(int[] arr){
        int odd=0,even=0;
        int[] arr1=new int [2];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }else{
                odd++;
            }
        }
        arr1[0]=even;
        arr1[1]=odd;
        return arr1;

    }
}
