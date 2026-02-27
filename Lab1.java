class Lab1
{
    static void output()
    {
        System.out.println("This is function");
    }
     void outputt()
    {
        System.out.println("This is using without static ");
    }
    public static void main(String [] args)
    {
        Lab1 obj=new Lab1();//call with object when static not used
        obj.outputt();
        output();
    }
}