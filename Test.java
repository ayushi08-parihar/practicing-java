import java.util.*;
class Test
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
    
        int arr[]=new int[size];
        
        System.out.println("Enter  marks");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=1;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Highest marks: "+max);
        System.out.println("Lowest marks: "+min);
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        double avg=(double)sum/size;
        System.out.println("Average marks: "+avg);

    }
}