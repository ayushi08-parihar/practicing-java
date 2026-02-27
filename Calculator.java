public class Calculator
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int sub(int a,int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static int div(int a,int b)
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        int a=10,b=5;
        System.out.println("Addition of "+a+" and "+b+" is: "+add(a,b));
        System.out.println("Subtraction of "+a+" and "+b+" is: "+sub(a,b));
        System.out.println("Multiplication of "+a+" and "+b+" is: "+mul(a,b));
        System.out.println("Division of "+a+" and "+b+" is: "+div(a,b));
    }
}