import java.util.*;
public class Largest
{
    public static void main(String [] arg)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number");
         int a=sc.nextInt();
         System.out.println("Enter 2nd number");
         int b=sc.nextInt();
         if(a>b)
            System.out.println("a is largest");
         else if(b>a)
            System.out.println("b is largest");
        else
            System.out.println("both are equal");
    }
}