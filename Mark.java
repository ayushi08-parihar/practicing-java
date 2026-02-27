//CRETAE MARKSHEET FOR 3 SUBJECT AND FIND OUT TOTAL AND PERCENTAGE WITH CONSTRUCTOR
import java.util.*;
class Marksheet {
    int subject1;
    int subject2;
    int subject3;

    Marksheet( int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    void calculate() {
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300.0) * 100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Mark
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        Marksheet marksheet = new Marksheet( subject1, subject2, subject3);
        marksheet.calculate();

        scanner.close();
    }
    }
