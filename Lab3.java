//REVERSING BY METHOD
public class Lab3
{ 
    static void revArray(int num[])
    {
        System.out.println("ELEMENTS IN REVERSE ORDER");
        {
            for(int i=num.length-1;i>=0;i--)
            {
                System.out.println(num[i]);
            }
        }
    }
   
    public static void  main (String [] args)
    {
        int num[]={2,3,4,5,6};
        revArray(num);
    }
}