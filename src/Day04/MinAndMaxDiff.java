package Day04;

public class MinAndMaxDiff {
    public static void main(String[] args)
    {
        int[] arr={12,45,67,89,10,9,8};
        int diff=DiffminAndmax(arr);
        System.out.println("The diff min and max values is  "+diff);
    }
    static int DiffminAndmax(int[] arr1){
        Integer max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int a=0,b=0;
        for (int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i]){
                max=arr1[i];
            }
            if(min>arr1[i]){
                min=arr1[i];
            }
        }
        b=max;
        a=min;
        return (b-a);
    }

}
