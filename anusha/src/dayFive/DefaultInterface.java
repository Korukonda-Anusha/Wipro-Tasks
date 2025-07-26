package dayFive;
interface MyInterface {
    default void greet() {
        System.out.println("Hello from default method");
    }
}

class MyClass implements MyInterface {
    // No need to override 'show' unless custom behavior is needed
}

public class DefaultInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();  // Output: Hello from default method
    }
}
