class Demo
{
    void display()
    {
        System.out.println("this is display method");
    }
}
class DerivedClass extends Demo
{
    void display()
    {
        System.out.println("this is display method of erived class");
    }
    void next()
    {
       display();
       super.display();
    }
}
public class Usesuper
{
    public static void main(String[] args)
    {
        DerivedClass obj=new DerivedClass();
        obj.next();
    }
}
