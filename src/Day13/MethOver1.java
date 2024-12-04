//1. Write two methods with the same name but different number of parameters of same type and call the methods from main method
//2. Write two methods with the same name but different number of parameters of different data type and call the methods from main method
//3. Write two methods with the same name and same number of parameters of same type and call from main method
//4. Write two methods with the same name and same number of parameters of different type and call from main method
//5. Write two methods with the same name, number of parameters and data type but different return Type
package Day13;
public class MethOver1 {
    //1. Ans
    static int  Add(int x,int y){
        return x+y;
    }
    static int Add(int x){
        return ++x;
    }
    //2.Ans
    // No need to use static since I do not want to create object I am using static .
    static void PersonalDetails(String name,char grade){
        System.out.printf("The given method has details like name:%s and in which grade:%c\n",name,grade);
    }
    static void PersonalDetails(String name,char grade,int age){
        System.out.printf("The given method has details like name:%s and in which grade:%c and also his age:%d \n",name,grade,age);
    }
    //3 .There will be an error when 2 methods of same name and same parameters are defined since the java  can not distinguish b/w same methods
    //4 .Here I am using Add function from 1)Ans
    //5 Same
    static String Add(String str,String str1){
        return str+" "+str1;
    }
    public static void main(String[] args){
        System.out.println("Value of Overload Method1 "+Add(5,4));
        System.out.println("Value of Overload Method2 "+Add(5));
        PersonalDetails("Raza",'B');
        PersonalDetails("Raza",'C',27);
        System.out.println(Add("This is a add method","of different type and parameters"));
    }

}

