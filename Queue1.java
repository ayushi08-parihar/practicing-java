import java .util.*;
public class Queue1 {
    public static void main(String[] args) {
     PriorityQueue<String> pq = new PriorityQueue<String>();
     pq.add("A");
     pq.add("B");
     pq.add("C");
     System.out.println(" QUEUE  "+pq.element());
     System.out.println("PEEK QUEUE  "+pq.peek());
     System.out.println("REMOVE QUEUE  "+pq.remove());
     System.out.println("REMOVE QUEUE  "+pq.poll());
     System.out.println(pq);
     System.out.println("REMOVE QUEUE  "+pq.remove());
     System.out.println("REMOVE QUEUE  "+pq.poll());
     System.out.println(pq);

    }
}