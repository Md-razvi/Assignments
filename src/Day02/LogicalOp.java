package Day02;
//Programs on Logical AND,OR operator and Logical NOT
public class LogicalOp {
    public static void main(String[] args){
        boolean a=true,b=false;
        //Logical operators  work on boolean values i.e. true and false
        //And operator && both the values should be true otherwise it is false ;
        System.out.println(a&&b);
        //Or Operator || any one can be true the result is true
        System.out.println(a||b);
        //Not Operator ! converts the true to false i.e not true or false to true i.e. not false
        System.out.println(!b);
        System.out.println(!a);
//      System.out.print(c&&d);
    }
}
