package Q21;

import java.io.*;

import java.io.*;

public class MyClass implements Serializable {
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void serialize() {
        try {
            FileOutputStream fileOut = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Object serialized successfully!");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static MyClass deserialize() {
        MyClass obj = null;
        try {
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized successfully!");
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        return obj;
    }
}

// To serialize an object
MyClass obj = new MyClass("John", 30);
obj.serialize();

// To deserialize an object
MyClass newObj = MyClass.deserialize();
System.out.println(newObj.name); // Output: John
System.out.println(newObj.age); // Output: 30

}}