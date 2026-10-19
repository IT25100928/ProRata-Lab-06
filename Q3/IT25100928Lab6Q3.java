import java.util.Scanner;

public class IT25100928Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        double sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumOfSquares += (double) number * number;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo numbers entered.");
        }

        scanner.close();
    }
}