import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //INSERTING ELEMNT IN STACK
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("STACK   "+stack);
        System.out.println("PEEK ELEMENT:  "+stack.peek());
        System.out.println("POPED ELEMENT   "+stack.pop());
        System.out.println("STACK AFTER POP   "+stack);
    }
}