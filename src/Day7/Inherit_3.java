//Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members

package  Day7;
class A2 {
    String data = "Data from class A2";

    String getData() {
        return data;
    }
}

// Subclass B2
class B2 extends A2 {
    String data = "Data from class B2";

    @Override
    String getData() {
        return data;
    }
}

// Subclass C2
class C2 extends A2 {
    String data = "Data from class C2";

    @Override
    String getData() {
        return data;
    }
}

public class Inherit_3 {
    public static void main(String[] args) {
        // Superclass reference pointing to subclass objects
        A2 objB2 = new B2();
        A2 objC2 = new C2();

        // Call getter methods
        System.out.println(objB2.getData()); // Accesses overridden getData() in class B2
        System.out.println(objC2.getData()); // Accesses overridden getData() in class C2
    }
}
