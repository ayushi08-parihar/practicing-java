//functional interface do study

//Using Lambda Expression
/*@FunctionalInterface
interface Mathematics
{
    int sumvalue(int a, int b);
}
public class UseLambda{
    public static void main(String[] args) {
      Mathematics obj = (a, b) -> a + b;
      System.out.println("The sum of numbers is: " + obj.sumvalue(5, 10));
    }
}*/
//functional interface do study

//Using Lambda Expression Square of a num
@FunctionalInterface
interface Mathematics
{
    int square(int a);
}
public class UseLambda{
    public static void main(String[] args) {
      Mathematics obj = (a) -> a*a;
      System.out.println("The sum of numbers is: " + obj.square(5));
    }
}