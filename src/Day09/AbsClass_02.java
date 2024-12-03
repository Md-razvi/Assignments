//2. Create a sub Class for an abstract class. Create an object in the child class for the
//   abstract class and access the non-abstract methods
//3. Create an instance for the child class in child class and call abstract methods
//4. Create an instance for the child class in child class and call non-abstract methods
package Day09;
abstract class Shapes{
    abstract double Perimeter();
    abstract double Area();
    public void display() {
        System.out.println("Every thing has a shape");
    }
}
//sub class inheriting abstract class
class Circle extends Shapes{
    private double radius;
    final double pi=22/7;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double Perimeter() {
        return (2*pi*radius);
    }
    @Override
    double Area() {
        return (radius*pi*pi);
    }
}
public class AbsClass_02 {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        double perimeter=circle.Perimeter();
        double area=circle.Area();
        System.out.println(perimeter);
        System.out.println(area);
        circle.display();

    }
}
