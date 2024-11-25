package Day4;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    static Integer[] Duplicates(int[] a)
    {
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i+1;j<a.length;j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if(count==0)
            {
                b.add(a[i]);
            }
        }
        Integer[] arr1=new Integer[b.size()];
        arr1=b.toArray(arr1);
        return  arr1;



    }
    public static void main(String[] args){
        int[] a={108,7,7,8,8,10,10};
        Integer[] c=Duplicates(a);
        System.out.println(Arrays.toString(c));
    }
}
