class UseMultipleCatch {
    public static void main(String [] args)
    {
        try{
          int arr[]={1,2,3,4,5};
          System.out.println(arr[6]);// This will throw ArrayIndexOutOfBoundsExceptgit
          String str=null;
          System.out.println("length of name="+str.length());// This will throw NullPointerException
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error="+ex.getMessage());
        }
        catch(NullPointerException ex)
        {
            System.out.println("Error="+ex.getMessage());
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error="+ex.getMessage());
        }7
        catch(Exception ex) // This will catch any other type of exception
        {
            System.out.println("Error="+ex.getMessage());
        }
         System.out.println("End of program");
    }
}