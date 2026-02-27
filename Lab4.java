public class Lab4
{
   
    public static void  main (String [] args)
    {
        int num[]={2,3,4,5,6,5,67,34,23,45,89};
        int len=num.length;
        System.out.println("ELEMENTS ARE=");
        for(int i=0;i<len;i++) //for(int i=0;i<len;i++)
        {
            System.out.println(num[i]);
        }
        int min=num[0];
        int max=num[0];
        for(int i=0;i<len;i++)
        {
            if(min>num[i])
              min=num[i];
            if(max<num[i])
               max=num[i];
        }
        System.out.println("min="+min);
        System.out.println("max="+max);
    }
}