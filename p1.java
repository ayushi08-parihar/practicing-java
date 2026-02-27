class Demo
{
    Demo()
    {
        System.out.println("this is display method");
    }
}
class DerivedClass extends Demo
{
    DerivedClass()
    {
        System.out.println("this is display method of erived class");
    }
    
}
class C extends DerivedClass 
{
    C()
    {
        System.out.println("this is display method of Derived class");
    }
    
}
public class p1
{
    public static void main(String[] args)
    {
        C C=new C();//constrctor call autumatically when onject is created thus all 3 o/p have inbuild super class
    }
}