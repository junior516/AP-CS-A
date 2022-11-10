import java.util.*;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power of 2 you want the program to display. (Whole numbers only)");
        int power = input.nextInt();
        int answer = (int) Math.pow(2, power);

        while (power >= 0) {
            System.out.println("2^" + power + ": " + answer);
            System.out.println("Enter the power of 2 you want the program to display. (Whole numbers only)");
            power = input.nextInt();
            answer = (int) Math.pow(2, power);
        }

        if (power < 0) {
            System.out.println("Halted program.");
            input.close();
        }

    }
}
