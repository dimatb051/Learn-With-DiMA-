import java.util.Scanner;
// Checking if a number is even or odd by using if statement
public class EvenChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
int num = scanner.nextInt();
      if (num % 2 == 0) { 
// If the remainder is zero, it's even
            System.out.println("Number is even"); 
      }
     else {
            System.out.println("Number is odd");
     }

        scanner.close();
    }
}
