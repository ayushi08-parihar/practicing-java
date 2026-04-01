import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
//ITERATION USING FOR LOOP
        for(String name:names)
        System.out.println(name);
        
    }
}