import java.util.*;
public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(22,11,23,15,67);
        list.stream().filter(n->n>20).map(n->n*n).forEach(System.out::println);
    }

}