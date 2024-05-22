import java.io.*;
class Person1 implements Serializable{
    private String name;

    public Person1(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person1 person = new Person1("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

