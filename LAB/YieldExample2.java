public class YieldExample2 {
    public static void main(String arhs[]){
        int num=4;
        String result =switch(num%2){
            case 0:
                System.out.println("Even Number");
                int square=num*num;
                yield "Square: "+square;
            case 1:
                System.out.println("Odd Number");
                int cube=num*num*num;
                yield "Cube: "+cube;
            default:
                yield "Invalid Number";
        };
        System.out.println(result);
        }
    }