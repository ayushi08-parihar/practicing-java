//Write a Java program to accept n numbers from command line arguments, store them in an array, and find the second largest number.
import java.util.Arrays;
public class ArraylargeCLA {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two numbers as command line arguments.");
            return;
        }

        int[] numbers = new int[args.length];
        
        // Convert command line arguments to integers
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + args[i]);
                return;
            }
        }

        // Sort the array
        Arrays.sort(numbers);

        // The second largest number will be the second last element in the sorted array
        int secondLargest = numbers[numbers.length - 2];
        
        System.out.println("The second largest number is: " + secondLargest);
    }
}

/*public class ArraylargeCLA {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide at least two numbers.");
            return;
        }

        int n = args.length;
        int[] numbers = new int[n];

        // Store command-line arguments into array
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Number: " + secondLargest);
        }
    }
}*/