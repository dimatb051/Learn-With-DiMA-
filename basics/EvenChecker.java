import java.util.Scanner;
/*
Check if a number is even or odd */
public class EvenChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
int num = scanner.nextInt();
      if (num % 2 == 0) {
            System.out.println("Number is even"); 
      }
     else {
            System.out.println("Number is odd");
     }

        scanner.close();
    }
}
