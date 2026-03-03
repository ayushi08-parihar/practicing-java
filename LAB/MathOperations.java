class MathOperations {

    // 1. Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // 2. Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // 3. Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();
        System.out.println("Sum of :");
        // Calling add() with two integers
        int sum1 = obj.add(12, 20);
        System.out.println(" two integers: " + sum1);

        // Calling add() with two doubles
        double sum2 = obj.add(3.5, 4.6);
        System.out.println(" two doubles: " + sum2);

        // Calling add() with three integers
        int sum3 = obj.add(14, 23,34);
        System.out.println(" three integers: " + sum3);
    }
}