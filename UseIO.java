import java.io.*;
public class UseIO
{
    public static void main(String [] args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter name");
        String name=br.readLine();
        System.out.println("Name="+name);
        System.out.println("Enter id");
        int id =Integer.parseInt(br.readLine());
        System.out.println("Id="+id);
        System.out.println("Enter Address");
        String add=br.readLine();
        System.out.println("Address="+add);
        System.out.println("Enter Height");
        double h=Double.parseDouble(br.readLine());
        System.out.println("height="+h);
        System.out.println("Enter gender");
        char gen=br.readLine().charAt(0);
        System.out.println("gender="+gen);
    }
}