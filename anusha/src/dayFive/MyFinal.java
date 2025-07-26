package dayFive;

interface Constants {
    int VALUE = 100;  // implicitly final
}

// Final class cannot be extended
final class FinalClass {
    void show() {
        System.out.println("Inside FinalClass");
    }
}

// Class using final method
class Parent {
    final void display() {
        System.out.println("This is a final method");
    }
}

// Trying to override final method – not allowed
class Child extends Parent {
//     void display() { 
//         System.out.println("Trying to override");
//     }
}

public class MyFinal {
    public static void main(String[] args) {
        System.out.println("Final variable from interface: " + Constants.VALUE);

        FinalClass fc = new FinalClass();
        fc.show();

        Child ch = new Child();
        ch.display();
    }
}
