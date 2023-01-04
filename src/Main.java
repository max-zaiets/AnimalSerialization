import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("vasya", 5, 4);

        try {
            FileOutputStream fo = new FileOutputStream("D:\\IntellijProjects\\AnimalSerialization\\src\\AnimalSerialized.txt");
            ObjectOutputStream ou = new ObjectOutputStream(fo);
            ou.writeObject(a);
            ou.flush();
            ou.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
