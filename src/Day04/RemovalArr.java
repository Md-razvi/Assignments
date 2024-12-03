package Day04;

public class RemovalArr {
    public static void main(String[] args)
    {
        int[] arr={12,35,49,65,89,108,109};
        //We will  remove the element based on index value given to the function
        int[] arr1=DeleteElement(arr,2  );
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+", ");
        }
    }
    static int[] DeleteElement(int[] arr,int index){
        //Since we are removing an element we are initializing an array with one less element
        int[] newarr=new int[arr.length-1];
        //index should be with in the range of give array
        if (index<0||index>arr.length)
        {
            return arr;
        }

        for(int i=0,j=0;i<arr.length-1 &&j<arr.length;i++,j++)
        {
            if(j==index)
            {
                j++;
                newarr[i]=arr[j];
            }else{
                newarr[i]=arr[j];


            }

        }
        return  newarr;
    }
}
