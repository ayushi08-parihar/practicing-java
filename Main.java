import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        System.out.println("Names in the collection:");
        Iterator it= names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}