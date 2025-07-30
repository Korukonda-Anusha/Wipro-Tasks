package dayNine;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// ✅ Make class Serializable
class Students implements Serializable {
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Serialization1 {
    public static void main(String[] args) {
        try {
            Students s1 = new Students("sakshi", 45);
            s1.setName("girish");
            s1.setAge(56);

      
            FileOutputStream out = new FileOutputStream("Hello.txt");
            ObjectOutputStream output = new ObjectOutputStream(out);

            output.writeObject(s1);

            output.close();
            out.close();

            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
