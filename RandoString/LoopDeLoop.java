import java.util.*;

public class LoopDeLoop {

    // print stars in staircase form left to right
    public static void printStars(Integer n) {
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    // print stars in staircase form right to left, through the use of spaces
    public static void printStarsInSpace(Integer n) {
        for (int i = 1; i <= n; i++) {
            for (int space = n; space >= (i + 1); space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    // combination of both star methods into one
    public static void printStarsVictory(Integer n) {
        int position = 1;
        while (position <= n) {
            for (int star = 1; star <= position; star++) {
                System.out.print("*");
            }

            for (int space = n; space >= (position + 1); space--) {
                System.out.print(" ");
            }

            for (int space = n; space >= (position + 1); space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= position; star++) {
                System.out.print("*");
            }

            System.out.println("");
            position++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LoopdeLoop! Type in the amount of rows you want for your stars! (must be a whole number)");
        int n = input.nextInt();
        printStars(n);
        printStarsInSpace(n);
        printStarsVictory(n);
        input.close();
    }
}
