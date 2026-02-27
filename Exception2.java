class Exception2  {
    public static void main(String [] args)
    {
        
          int arr[]={1,2,3,4,5};
          try{
            for(int i=0;i<=7;i++)
            {             System.out.println(arr[i]);
            }
          //System.out.println(arr[6]);// This will throw ArrayIndexOutOfBoundsException
          }catch(ArrayIndexOutOfBoundsException ex)
          {
            System.out.println("Error: "+ex.getMessage());
          }
          finally
          {
          System.out.println("End of program");
          }

        /* try{
          String str=null;
        
          System.out.println("length of name="+str.length());// This will throw NullPointerException
          }catch(NullPointerException ex) //OR WRITE AS catch(Exception ex) to catch all types of exceptions
          {
           System.out.println("Error="+ex.getMessage());
          }*/
    }
}