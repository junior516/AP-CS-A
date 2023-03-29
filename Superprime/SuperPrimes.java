import java.util.*;

public class SuperPrimes {
   /* COMPLETE THIS METHOD */
   // main method, use comments as a guide
   public static void main(String[] args) {
      // tell the user what the program will do
      System.out.println("This program will find all superprimes.");
      System.out.println(
            "A superprime is a prime number that stays prime no matter how many digits are repeatedly removed from the right.");
      System.out.println("For example, 233 is a superprime because 23 and 2 are both prime. 233 -> 23 -> 2.");

      // prompt the user for the number of digits and read in response
      Scanner console = new Scanner(System.in);
      System.out.println("In what digits do you want to find superprimes in?");
      int numDigits = console.nextInt();
      System.out.println("Superprimes with " + numDigits + " digits:");
      // determine lower and upper bounds for looping
      // over numbers with that many digits
      int lowerBound = (int) Math.pow(10, numDigits - 1);
      int upperBound = (int) Math.pow(10, numDigits) - 1;
      // for each number, determine whether it is a superprime
      // and if so, output it to the screen.
      boolean found = false;
      for (int i = lowerBound; i <= upperBound; i++) {
         if (superPrime(i)) {
            System.out.println(i);
            found = true;
         }
      }
      // if there are no superprimes, output "None"
      if (!found) {
         System.out.println("None");
      }
      console.close();
   }

   /* COMPLETE THIS METHOD */
   // Recursive method.
   // return true if the provided number is superprime, false otherwise.
   public static boolean superPrime(int x) {
      if (isPrime(x)) {
         if (x < 10) {
            return true;
         }
         return superPrime(x / 10);
      }
      return false; // to support compilation until the method is written
   }

   /* COMPLETE THIS METHOD */
   // non-recursive method.
   // return true if the provided number is prime, false otherwise
   public static boolean isPrime(int num) {
      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            return false;
         }
      }
      if ((num != 1) && (num != 0)) {

         return true; // to support compilation until the method is written
      } else {
         return false;
      }
   }
}