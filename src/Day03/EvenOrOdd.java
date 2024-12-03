package Day03;

public class EvenOrOdd {
    public static void main(String[] args)
    {
        PrintEvenOdd();
    }
    static void PrintEvenOdd(){
        int a=12;
        for(int i=1;i<a;i++)
        {
            int res=i%2;
            switch (res) {
                case 0:
                    System.out.println(i + ". It is an even");
                    break;
                case 1:
                    System.out.println(i + ". It is an Odd number");
                    break;
            }

            }
        }
    }

