import java.util.*;
public class UsingSet{
    public static void main(String args[])
    {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Programming");
        System.out.println(set);
    }
}