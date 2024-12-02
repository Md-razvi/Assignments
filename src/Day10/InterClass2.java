package Day10;
//2. Create an interface with two methods, but implement only one in a class. Call the method implemented.
//3. Use Interface instances to call the implemented method in the implemented class
interface Vehicle{
    //Interface with 2 Methods
    void Accelerate();
    void Steer();
}
class Bus implements Vehicle{
    //Cal
    @Override
    public void Steer() {
        System.out.println("Left or Right or None");
    }
    @Override
    public void Accelerate(){
        System.out.println("Accelerate or Deccelerate");
    }
}
public class InterClass2 {
    public static void main(String[] args){
     Bus volvo=new Bus();
     //Calling the method impemented
     volvo.Steer();
     volvo.Accelerate();
    }
}
