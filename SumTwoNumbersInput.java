import java.util.Scanner;
// We must add this line above (that consider the method for the scanner).
// Program to calculate the sum of two numbers, practice on: scanner and basic arithmetic

public class SumTwoNumbersInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the result directly
        int sum = num1 + num2;
        System.out.println("The total sum is: " + sum);

        scanner.close();
    }
}
