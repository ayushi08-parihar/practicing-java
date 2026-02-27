import java.util.*;
class usescanner
{
    public static void main(String [] arg)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter id");
         int id=sc.nextInt();
         System.out.println("Enter name");
         String name=sc.next();
         System.out.println("Enter address");
         String add=sc.next();
         System.out.println("Enter gender");
         char gen=sc.next().charAt(0);
         System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("address="+add);
         System.out.println("gender="+gen);
    }
}