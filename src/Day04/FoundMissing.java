package Day04;
import java.util.Arrays;
public class FoundMissing {
    public static void  main(String[] args){
        int[] arr=new int[100];
        int j= 1;
        String Missnumbers;
        for(int i=0;i<=arr.length;i++)
        {
            if(i%5==0 && i!=0)
            {
                j++;
                continue;
            }else{
                arr[i]=j;
                j++;
            }
        }
        System.out.println("The given are numbers are  "+Arrays.toString(arr));
        Missnumbers=MissingNumbers(arr);
        System.out.println("The missing numbers are "+Missnumbers);

    }
    static String MissingNumbers(int[]a){
        String missNumbers="";
        int i=0,j=1;
        while(i<100)
        {
            if(a[i]==0)
            {
                missNumbers=missNumbers+j+", ";
            }
            i++;
            j++;
        }

        return missNumbers;
    }
}
