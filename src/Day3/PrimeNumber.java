package Day3;

public class PrimeNumber {
    public static void main(String[] args)
    {
//      double a=7;
      boolean IsTrue=isPrime(1669);
      if(IsTrue)
      {
          System.out.println("It is Prime");
      }else{
          System.out.println("It is not Prime");
      }
    }
    static  boolean isPrime(double a){
        int b=(int)(Math.sqrt(a));
        int c=(int)a;
        for (int i=2;i<=b;i++){
            if(c%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
