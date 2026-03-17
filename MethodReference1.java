import java.util.*;
class MethodReference1 {
    public static void main(String e) 
    {
        System.out.println(e);
    }
    public static void main(String[] args)
    {
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        employees.forEach(System.out::println);
    }
}