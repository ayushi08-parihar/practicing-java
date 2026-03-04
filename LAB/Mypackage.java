
import userpackage.*;
public class Mypackage {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 20);
        int mul = calc.mul(5, 4);
        int sub = calc.sub(15, 5);
        float div = calc.div(10, 2);
        System.out.println("Sum is: "+sum);
        System.out.println("Product is: "+mul);
        System.out.println("Division is: "+div);
        System.out.println("Subtraction is: "+sub);
    }
}