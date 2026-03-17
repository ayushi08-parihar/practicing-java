//list of five element and square of each element
import java.util.*;

public class Stream2{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
        numbers.stream().map(n -> n * n).forEach(System.out::println);
    }
}