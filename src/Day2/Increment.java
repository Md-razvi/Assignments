package Day2;
public class Increment {
    public static void main(String[] args)
    {
        int a=2,b=3 ,c=7,d=8,result1=0;
        int result2=0;

        //Check the result of result1;
        //Because a=2 and b=3 are incremented i.e. pre incremented and the answer is 7
        result1=(++a)+(++b);
        System.out.println(result1);
        //Now check the result the result2;
        //Because these are post incremented the answer is simple (7+8)=15
        // See the results of increment and decrement below for better understanding
        result2=(d++)+(c++);
        System.out.println(result2);
        //Pre-Increment
        System.out.println("Post Increment "+(++a));
        System.out.println("Post Increment "+(++b));
        //Post Increment
        System.out.println("Post Increment "+(c++));
        //Increments after a line
        System.out.println(c);
        System.out.println("Post Increment "+(d++));
        System.out.println(d);



    }
}
