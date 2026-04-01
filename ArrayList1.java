//WRITE A  PROGRAM TO INPUT N NUMBERS OF STUDENT  AGE AND STORE IN ARRAYLIST AND DISPLAY THE AGE OF STUDENT USING ITERATOR
import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            ages.add(age);
        }

        System.out.println("Ages of students :");
        Iterator<Integer> it = ages.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}