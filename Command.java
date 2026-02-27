public class Command
{
    public static void main(String[] args)
    {
        System.out.println("This is command line argument");
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}