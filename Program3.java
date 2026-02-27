//import java.util.*;
/*class program3
{
    public static void main(String [] arg)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int a=sc.nextInt();
         System.out.println("Enter a  second number");
         int b=sc.nextInt();
         int c=a+b;
         System.out.println("sum="+c);
    }
}*/
/*class program3
{
    public static void main(String [] arg)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter breadth number");
         int a=sc.nextInt();
         System.out.println("Enter a  length number");
         int b=sc.nextInt();
         int c=a*b;
         System.out.println("area of rectangle="+c);
    }
}*/
import java.io.*;
class Program3
{
    public static void main(String [] args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter name");
        String name=br.readLine();
        System.out.println("Name="+name);
    }
}


