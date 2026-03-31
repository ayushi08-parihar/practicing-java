import java.util.*;
public class Stream3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 34, 11, 10, 35, 22, 45, 50);
        OptionalInt max = numbers.stream().mapToInt(n -> n).max();
        if (max.isPresent()) {
            System.out.println("Maximum number: " + max.getAsInt());
        } else {
            System.out.println("List is empty.");
        }
    }
}