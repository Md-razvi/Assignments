//6. Write a program to create your own exception
package Day14;
class CustomExcept extends Exception{
    CustomExcept(String custommessage){
        super(custommessage);
    }
}
public class Except_06 {
    static void Method_01(int a) throws CustomExcept{
        if(a>60){
            System.out.println("Pension acquired");
        }else{
            throw new CustomExcept("Sorry you are less than 60 hence pension can't be taken");
        }
    }
    public static void main(String[] args){
        try{
            Method_01(43);
        }catch (Exception i){
            i.printStackTrace();
        }
    }
}
