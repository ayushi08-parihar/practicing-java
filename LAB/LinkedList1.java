import java.util.*;
public class LinkedList1 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.addFirst("welcome!");
        list.addLast("Goodbye");
        System.out.println(list);
    }
}