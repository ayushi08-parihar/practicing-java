//write 5 marks store in collection and display them
import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        Collection<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);

        System.out.println("Marks: " + marks);
    }
}