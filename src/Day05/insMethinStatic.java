//Call instance methods in static methods
package Day05;
public class insMethinStatic {
    public static void main(String[] args)
    {
      PersonDetails obj1=new PersonDetails("Ajay","Male",32);
      PersonDetails obj2=new PersonDetails("Seeta","Female",27);
      ShowDetail(obj1);
      ShowDetail(obj2);

    }
    //Instances are taken using Class obj1
    static void ShowDetail(PersonDetails obj1){
      obj1.Show();
    }
}
class PersonDetails{
    String name;
    int age;
    String gender;
    public PersonDetails(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    void Show(){
        System.out.println(name+" is a "+age+" years old healthy "+gender);
    }
}
