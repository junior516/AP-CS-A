import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // scanner to retrieve data
        Scanner input = new Scanner(System.in);
        // retrieve dividend
        System.out.println("Choose the dividend: ");
        int dividend = input.nextInt();
        // retrieve divisor
        System.out.println("Choose a divisor: ");
        int divisor = input.nextInt();
        int quotient;
        int remainder;
        // retrieve remainder and quotient
        remainder = dividend % divisor;
        quotient = dividend / divisor;
        // output answer
        System.out.println(quotient + "r" + remainder);
        input.close();
    }
}