public class YieldExample {
    public static void main(String args[]){
        int day =2;
        String result =switch(day){
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Invalid day";
        };
        System.out.println(result);
    }
}