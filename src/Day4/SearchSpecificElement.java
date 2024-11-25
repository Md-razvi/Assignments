package Day4;

public class SearchSpecificElement {
    public static void main(String[] args){
        int[] a={23,45,67,12};
        boolean isSearch=FindSpecific(a,12,23);
        if(isSearch){
            System.out.println("Is Found");
        }else{
            System.out.println("Not found");
        }
    }
    static boolean FindSpecific(int[] arr1,int a,int b){
        int count=0;
        boolean isFound=false;
        for (int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==a||arr1[i]==b)
            {
                count++;
            }
        }
        if(count==2)
        {
            isFound=true;
        }
        return isFound;
    }
}
