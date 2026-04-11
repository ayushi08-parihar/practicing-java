import java.util.*;
class StudentInfo
{
    int id;
    String name;
    int age;
    StudentInfo(int id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
} 
 class SortByAge implements Comparator<StudentInfo>3
{
    public int compare(StudentInfo s1, StudentInfo s2)
    {
        return Integer.compare(s1.age, s2.age);
    }
}
class SortbyName implements Comparator<StudentInfo>
{
    public int compare(StudentInfo s1, StudentInfo s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
public class UseComparator {
    public static void main(String[] args) {
        ArrayList<StudentInfo> students = new ArrayList<>();
        students.add(new StudentInfo(1, "Alice", 20));
        students.add(new StudentInfo(2, "Bob", 22));
        students.add(new StudentInfo(3, "Charlie", 19));
        students.add(new StudentInfo(4, "David", 21));
        students.add(new StudentInfo(5, "Eve", 20));

        // Sort students by age
        Collections.sort(students, new SortByAge());

        // Print sorted students
        System.out.println("ID\tNAME\tAGE");
        for (StudentInfo student : students) {
            System.out.println(student.id + "\t" + student.name + "\t" + student.age);
        }
        // Sort students by name
        Collections.sort(students, new SortbyName());

        // Print sorted students
        System.out.println("ID\tNAME\tAGE");
        for (StudentInfo student : students) {
            System.out.println(student.id + "\t" + student.name + "\t" + student.age);
        }
    }
}