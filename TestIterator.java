import java.util.*;

class TestIterator {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        System.out.println("Names in the collection:");
        Iterator<String> it= names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}