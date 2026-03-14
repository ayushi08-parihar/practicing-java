interface Message{
    void getMessage();
}
public class Uselambda3{
    public static void main(String args[])
    {
        Message msg=()->System.out.println("WELCOME");
        msg.getMessage();
    }
}