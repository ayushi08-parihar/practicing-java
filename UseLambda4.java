interface Mathematics
{
    int max(int a, int b);
}
public class UseLambda4{
    public static void main(String[] args) {
      Mathematics obj = (a, b) -> a > b?a:b;
      System.out.println("The largest numbers is: " + obj.max(5, 10));
    }
}