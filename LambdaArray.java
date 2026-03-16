@FunctionalInterface
interface Array
{
    void printarray(int n);
}
public class LambdaArray{
    public static void main(String[] args) {
        int arr[]={23,44,12,34,56,76,43};
      Array obj = (n) -> System.out.println(n);
        for(int i:arr)
        {
            obj.printarray(i);
        }
     
    }
}