
//Using Lambda Expression add 3 numbers 
@FunctionalInterface
interface Mathematics
{
    int sumvalue(int a, int b,int c);
}
public class UseLambda1{
    public static void main(String[] args) {
      Mathematics obj = (a, b, c) -> a + b + c;
      System.out.println("The sum of numbers is: " + obj.sumvalue(5, 10, 15));
    }
}