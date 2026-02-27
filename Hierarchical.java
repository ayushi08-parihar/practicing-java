class Aktu{
    void exam()
    {
        System.out.println("Semester");
    
    }
}
class Ucer extends Aktu{
    void sessional()
    {
        System.out.println("Semester hii");
    
    }
}
class Bbs extends Aktu{
    void sessional()
    {
        System.out.println("Semester 89");
    
    }
}
public class Hierarchical
{
    public static void main (String args[])
    {
        Ucer ucer=new Ucer();
        ucer.sessional();
        ucer.exam();
        Bbs bbs=new Bbs();
        bbs.sessional();
        bbs.exam();

    }
}