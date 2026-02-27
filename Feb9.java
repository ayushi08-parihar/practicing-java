/*class Student
{
    void display()
    {
        System.out.println("WELCOME IN OOPS");
    }
}
public class Feb9
{
    public static  void main (String [] args)
    {
       Student obj=new Student();
       obj.display();
    }
}*/

//Write a progran to create a class employee and create two method display and output void print some message in this
/*class Employee
{
    void display()
    {
        System.out.println("hello employee this is your senior manager");
    }
    void output()
    {
         System.out.println("WELCOME To our family");
    }
}
public class Feb9
{
    public static  void main (String [] args)
    {
       Employee obj=new Employee();
       obj.display();
       obj.output();
    }
}*/

//WAP TO CREATE A CLASS STUDENT INFO AND CREATE DATA MEMBER ID INT NAME STRING COURSE 
//STRING AND CRETAE TWO METHOD SET INFO AND GET INFO AND SET INFO
class StudentInfo
{   
    int id;
    String name;
    String Course;
    void setInfo()
    { 
        id=101;
        name="AYU";
        Course="b tech";
    }
    void getInfo()
    {
        System.out.println("ID"+id);
        System.out.println("NMAE"+name);
        System.out.println("Course"+Course);
    }
}
public class Feb9
{
    public static  void main (String [] args)
    {
       StudentInfo obj=new StudentInfo();
       obj.setInfo();
       obj.getInfo();
    }
}