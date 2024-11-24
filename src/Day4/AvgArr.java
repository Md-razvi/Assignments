package Day4;

public class AvgArr {
    public static void main(String[] args)
    {
//        int[] number=new int[9];
        int [] number={12,34,5,8,9,26};
        float result=(float)AvgFunc(number);
        System.out.println("The average of numbers in a array is "+result);
    }
    static double AvgFunc(int[] x){
        double avg,sum=0;
        for (int j : x) {
            sum += j;
        }
        avg=sum/(x.length);
        return avg;
    }
}
