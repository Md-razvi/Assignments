package Day4;

public class SecondLargestArr {
    public static void main(String[] args){
        int[] arr={12,34,89,100,45,22,90};
        int a=SecondLargest(arr);
        System.out.println("The second largest number is "+a);
    }
    static int SecondLargest(int[]arr){
        int max=-1,secmax=-1;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i])
            {
                secmax=max;
                max=arr[i];
            }else if (max>arr[i]&&secmax<arr[i]){
                secmax=arr[i];
            }
        }
        return secmax;
    }
}
