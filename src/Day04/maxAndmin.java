package Day04;

public class maxAndmin {
    public static void main(String[] args){
        int[] arr={22,12,34,89,56,98,100};
        int max=0,min=0;
        boolean doit=true;
        for(int i=0;i<arr.length;i++)
        {
            if(doit){
             min=arr[i];
             max=arr[i];
             doit=false;
            }
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println("The min value is "+min);
        System.out.println("The max value is "+max);
    }
}
