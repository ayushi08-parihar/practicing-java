import java.util.*;
public class Mar9 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two numbers as command line arguments.");
            return;
        }

        int[] numbers = new int[args.length];
        
        // Convert command line arguments to integers
        for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
        }
        //printing index of second largest and second smallest number
        int sli = numbers.length - 2;
        int ssi = 1;    


        // Sort the array
        Arrays.sort(numbers);

        // The second largest number will be the second last element in the sorted array
        int secondLargest = numbers[numbers.length - 2];
        int secondSmallest = numbers[1];
        
        System.out.println("The second largest number is: " + secondLargest);
        System.out.println("The second smallest number is: " + secondSmallest);
        System.out.println("The index  second largest : " + sli);
        System.out.println("The index second smallest : " + ssi);
    }
}
