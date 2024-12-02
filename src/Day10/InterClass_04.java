//4. Create two interfaces with one method each. Implement these two interfaces in one class.
package Day10;
interface gameinter1{
    void MP();
}
interface  gameinter2{
    void HP();
}
 class Game implements gameinter1,gameinter2{
    @Override
    public void MP() {
        System.out.println("character magic points in gameinter1");
    }
    @Override
    public void HP() {
        System.out.println("Character health points in gameinter2");
    }
}
public class InterClass_04 {
    public static void main(String[] args){
        Game obj1=new Game();
        obj1.HP();
        obj1.MP();
    }


}
