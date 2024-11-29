package Day6;
import java.util.Arrays;
public class stringsProblem {
    public static void main(String[] args){
    //1. Different ways creating a string
    //There are two ways of creating a
    String str1="This is first type of string";
    System.out.println(str1);
    //There is a second way
    String str2=new String("This is a second type of string");
    System.out.println(str2);
    //2 .Concatenating string
    System.out.println(str1+str2);
    //3.Finding the length of the string
    String str3="1234567";
    System.out.println(str3.length());
    //4.Extract a string using Substring
    String str4="This is my World";
    String extworld=str4.substring(8,16);
    System.out.println(extworld);
    //5. Use of IndexOf
    //Use 1     "1234567890
    String str5="A big brown fox jumps over a brown cat sitting on the brown tree";
    int ab=str5.indexOf("brown");
    System.out.println(ab);
    int ab1=str5.indexOf("brown", 10);
    System.out.println(ab1);
    int  ab2=str5.indexOf('s',29);
    System.out.println(ab2);
    //6. Using matches function in string
    String word1="Jala Trainig";
    System.out.println("Matches Case 1 "+word1.matches("Jala"));
    System.out.println("Matches Case 2 "+word1.matches("(.*)Jala(.*)"));
    System.out.println("Matches Case 3 "+word1.matches("(.*)Training"));
    //7. Using equals a string case
    String ab34="String1";
    String ab35="string1";
    System.out.println("The str1 is equal to str2 : "+ab34.equals(ab35));
    // 8.  equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
    //Ignoring Upper case and Lower Case
    System.out.println("The str1 is equal to str2 : "+ab34.equalsIgnoreCase(ab35));
    String myStr = "Hello World";
    String myStr1="Hello Jala";
    //endswith()
        //This is a lexical comparison b/w Strings
        System.out.println("compareTo "+myStr.compareTo(myStr1));
        //9.Using trim();
        String myStr3="       Hello Jala Academy     ";
        System.out.println(myStr3+"_without trim function");
        String afterTrim=myStr3.trim();
        System.out.println(afterTrim+"_with trim function1");
        //10.Replacing characters in strings with replace()
        String Str4="Hollow the road";
        System.out.println("String before replace "+Str4);
        String Str5=Str4.replace('H','F');
        System.out.println("String before replace "+Str5);
        //11.Splitting strings with split();
        String Str8="This is a String array";
        String[] strarr=Str8.split(" ");
        System.out.println("This is a string array using split "+Arrays.toString(strarr));
        //12.Converting Numbers to Strings with valueOf()
        char[] myArray = {'a', 'b', 'c'};
        int numj=45;
        String strnum=String.valueOf(numj);
        System.out.println(strnum);
        //13.Converting integer objects to Strings
        int num2=54;
        String num_2=Integer.toString(num2);
        System.out.println("Integer value : "+num2+" String value : "+num_2);
        //14. Converting to uppercase and lowercase
       String UpCase="THIS IS A UPPERCASE";
       System.out.println(UpCase);
       System.out.println(UpCase.toLowerCase());
    }
}
