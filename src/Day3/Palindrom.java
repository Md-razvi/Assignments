package Day3;

public class Palindrom {
    public static void main(String[] args)
    {
        //Update a number
       int a=13231;
       System.out.println(isPalindrom(a));
    }
    static boolean isPalindrom(int a)
    {
        int result=0,m=a;
        while (a>0){
            int rem=a%10;
            result=rem+(result*10);
//            System.out.println(result);
            a=a/10;
        }
        if(m==result)
        {
            return true;
        }
        return false;

    }
}
