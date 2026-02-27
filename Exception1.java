class Exception1
{
    public static void main(String args[])
    {
        String str="abc";
        try{
        int num=Integer.parseInt(str);
         System.out.println("Num="+num);
         }catch(NumberFormatException ex)
        {
            System.out.println("Error="+ex.getMessage());
        }
        
       
       
    }
}