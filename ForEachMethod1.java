//create list of 6 employee and print
/*import java.util.*;
public class ForEachMethod1 {
    public static void main(String[] args) {
        List<String> employees =  Arrays.asList("RAM","Rahul","Raj","Ravi","Ramesh","Rajesh");

        employees.forEach(name -> System.out.println(name));
        }
    }
    */
import java.util.*;

class ForEachMethod1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = scanner.nextInt();  
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name:");
            String name = scanner.next();
            employees.add(name);
        }
        System.out.println("Employee names:");

        employees.forEach(name -> System.out.println(name));
    }
}
