interface First
{
    void output();
}
interface Second
{
    void next();
}
class DerievedClass implements First,Second
{
    public void output()
    {
        System.out.println("This is method 1");
    }
    public void next()
    {
        System.out.println("This is method of second interface");
    }
}
public class UseInterface
{
    public static void main(String[] args)
    {
       DerievedClass obj=new DerievedClass();
       obj.output();
       obj.next();
    }
}