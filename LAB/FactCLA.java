public class FactCLA {
    public static void main(String[] args) {
        
        // Check if argument is provided
        if (args.length != 1) {
            System.out.println("Please provide exactly one number.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}