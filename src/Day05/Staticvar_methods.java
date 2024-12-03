package Day05;
// A static variable is a variable that is common to all objects of the given class like Mobile .
//But the method where we give value to static variable using object is not correct instead we use Class name directly for static method
//In short it  belongs gto class not to object
// for perfect understanding see example1 highlighted below
//Same can be applied  for static methods.

class Mobile{
    String brand;//Intance variables
    int price;//Insatance variables
    static String type;//Static variable
    private static int year=2019;
    void Show(){
        System.out.println(brand+" : "+price+" : "+type);
    }
    static void Show1(){
        System.out.println(type);
    }
    //Instance can be called Indirectly but not directly.
    void Show3(){
        System.out.println(year);
    }
    static  void Show2(){
        System.out.println(year);
    }
    void Update(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

}
public class Staticvar_methods {
    public static void main(String[] args){
        Mobile n1=new Mobile();
        Mobile n2=new Mobile();
        n1.brand="Nokia";
        n1.price=1700;
//      n1.type="Smart Phone";
        n2.brand="Samsung";
        n2.price=3400;
        n2.Show();
        n1.Show();
        //Example 1:
        Mobile.type="Smartphone";
        n1.Show3();
        Mobile.Show1();
        n1.Update("iPhone",2900);
        Mobile.Show2();
        n1.Show();
        n2.Show();

    }
}
