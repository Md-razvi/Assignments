// Superclass
package Day07;

class A3 {
    void display() {
        System.out.println("Display method of class A2");
    }
}

// Subclass B2
class B3 extends A3 {
    @Override
    void display() {
        System.out.println("Display method of class B2");
    }
}

// Subclass C2
class C3 extends A3 {
    @Override
    void display() {
        System.out.println("Display method of class C2");
    }
}

public class Inherit_2 {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        A3 objB3 = new B3();
        A3 objC3 = new C3();

        // Call overridden methods
        objB3.display(); // Calls display method of class B2
        objC3.display(); // Calls display method of class C2
    }
}
