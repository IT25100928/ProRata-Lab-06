import java.util.Scanner;

public class IT25100928Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");
        int i = 1;
        while (i <= 10) {
            System.out.println("Enter number " + i + ":");
            numbers[i - 1] = scanner.nextInt();
            i++;
        }

        System.out.println("The numbers you entered are:");
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        scanner.close();
    }
}