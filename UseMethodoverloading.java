 class MyAirthematic
    {
         int add(int a,int b)
         {
            return a+b;
         }
         int add(int a,int b,int c)
         {
            return a+b+c;
         }
    }

public class UseMethodoverloading
{
    public static void main(String args [])
    {
        MyAirthematic obj=new MyAirthematic();
        System.out.println("SUM="+obj.add(10,30,70));
    }
}