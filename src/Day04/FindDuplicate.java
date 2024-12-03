package Day04;

public class FindDuplicate {
    static void Duplicates(int[]  arr){
        String numbers="";
//        System.out.println(duplcate[arr[0]]);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    numbers=numbers+arr[i]+",";
                }
            }
        }
System.out.println(numbers);
//        return duplcate;
    }
    public static void  main(String[] args)
    {
        int[] count={12,45,77,88,99,12,99,88};
        Duplicates(count);
    }
}
