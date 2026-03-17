import java.util.*;
class MethodReference
{
    public static void main(String args[])
    {
         List<String> employees = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
         employees.forEach(System.out::println);
     }
 }