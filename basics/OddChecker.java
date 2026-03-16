import java.util.Scanner;
//Odd Logic : if num % 2 != 0 mean is odd number!
//This program specific for odd numbers.
public class OddChecker {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

     if (num % 2 != 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

              scanner.close();
    }
}
