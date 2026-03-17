//list f 8 element and filter even  numbers
import java.util.*;
public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22,11,23,15,67,66,78,21);
        list.stream().filter(n->n%2==0).sorted().forEach(System.out::println);
    }

}

