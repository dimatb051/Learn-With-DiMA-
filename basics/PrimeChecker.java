import java.util.Scanner;

/*
  Program: cerat a program that reads number from
  the user and print "yes" if the number is primary
*/

public class PrimeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // This is the first condition we've to check it. 
        if (isPrime(num)) {
            System.out.println("Yes, it is prime");
        } else {
            System.out.println("No, not prime");
        }

        scanner.close();
    }

    // Then the program will continue to the second part (the method)
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Fixed: removed the semicolon
        
        if (n == 2) return true;

        if (n % 2 == 0) return false;
      
        // and finally it's a for loop to check other numbers!
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
