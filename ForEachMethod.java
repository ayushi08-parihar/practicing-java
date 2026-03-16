import java.util.*;
public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> num =  Arrays.asList(10,23,12,11,45,76,34,90);
        num.forEach(n -> System.out.println(n));
        
    }
}