package Day4;

public class CommonValues {
    public static void main(String[] args){
        int[] arr1={12,34,56,78,90,109};
        int[] arr2={12,44,109,56,76,22};
        String values=CoomonValues(arr1,arr2);
        System.out.println("The common values are "+values);
    }
    static String CoomonValues(int[] arr1,int[] arr2){
        String str1="";
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    str1=str1+arr1[i]+", ";
                }
            }
        }
        return str1;
    }
}
