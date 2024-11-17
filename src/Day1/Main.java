package Day1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // How to create a class, object, method and its signature?
// Ans) A class in Java is a blue print for creating objects. IT defines properties and behavious of Object
// we can simply create a class as shown below by adding a class keyword and a class name as shown below
//Objects are instances of a class that allow us to access its properties and methods.
//Example1 shows how objects are created
//Methods are set  of instruction that perform a particular task when they are called by a programmer . The concept of method is based on reusability and DRY(Dont repeat yourself)
//Each method has a signature that is its type and arguments (values in the bracket). based on arguments we can also  use method with same name but multiple ways (Method Overloading)
//See Example 2 Where method Add of type int has been created
//Main Class
                //Example 1
                Vehicle obj1=new Vehicle("Activa",2);
                Vehicle obj2=new  Vehicle("Toyota",4);
                obj1.DisplayVehicleDetails();
                obj2.DisplayVehicleDetails();
                int result=obj1.Add(12, 15);
                System.out.println("The result is "+result);
            }
        }
        class Vehicle{
            //Properties of a class
            String brand;
            int wheel;
            //Assigning values to the properties
            public Vehicle(String brand,int wheel) {
                this.brand=brand;
                this.wheel=wheel;
            }
            //Example 2
            public int Add(int a,int b){
                return a+b;

            }
            //displaying the values
            public void  DisplayVehicleDetails(){
                System.out.println("This vehicle is a "+this.wheel+" wheeler of company "+this.brand);
            }
        }





