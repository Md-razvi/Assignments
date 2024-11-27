//Print instance variables in static methods
package Day5;
class Vehicle{
    int tyres,seaters;
    String type;
public Vehicle(int tyres,int seaters,String type){
    this.tyres=tyres;
    this.seaters=seaters;
    this.type=type;
}
//Static void
static void ShowDetails(Vehicle obj){
    System.out.println(obj.seaters+" seaters : Vehicle "+obj.type+ " : Tyres "+obj.tyres);

}

}
public class instInStatic {
    public static void main(String[] args){
        Vehicle vehicle=new Vehicle(3,4,"Auto");
        Vehicle.ShowDetails(vehicle);


    }
}
