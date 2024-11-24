package Day4;
//import  java.util.Scanner;
public class ArrSum {
public static void  main(String[] args){
    //A simple array declarartion;
    int[] arr={1,5,6,7};
    int result =Add(arr);
    System.out.println("The sum of all the variables in an array arr is "+result);
}
static int Add(int[] x)
{
    int sum=0;
    for(int i=0;i<x.length;i++)
    {
        sum+=x[i];
    }
    return sum;
}
}
