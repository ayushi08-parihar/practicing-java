class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}
public class UserdefinedException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new MyException("Age must be greater than 18");
            }
        } catch (MyException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");

    }
}
}