class IvalidAgeException extends Exception {
    IvalidAgeException(String s) {
        super(s);
    }
}
public class UserdefinedException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new IvalidAgeException("Age must be greater than 18");
            }
        } catch (IvalidAgeException e) {
            System.out.println( e);
        } finally {
            System.out.println("This block is always executed.");

    }
}
}