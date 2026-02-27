abstract class ABC
{
    abstract void output();
    void print()
    {
        System.out.println("this is print method");
    }
}
public class UseAbstraction1 extends ABC
{
    @Override
    void output()
    {
        System.out.println("this is output method");
    }
    public static void main(String[] args)
    {
        ABC obj=new UseAbstraction1();
        obj.output();
    }
}