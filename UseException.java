public class UseException {
    public static void main(String[] args) {
        //try
         
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
            System.out.println("This line will not be executed due to the exception.");
         //catch (ArithmeticException e) {
            //System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }
    }
