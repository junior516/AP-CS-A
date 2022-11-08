import java.util.*;

public class PiEstimator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pi Estimator! This approximates Pi with accuracy dependent on iterations!");
        // retrieve input
        Scanner input = new Scanner(System.in);

        // get number of iterations
        System.out.println("Type in number of iterations used: ");

        int iterations = input.nextInt();

        // we initialize the estimationValue which equals Pi/4 in the formula
        double estimationValue = 1;

        // the denominator is initialized, which will be used in getting numbers for the sequence
        double denominator = 3;

        for (int i = 0; i < iterations; i++) {
            // follows plus and minus sequence
            if (i % 2 == 0) {
                // following the formula, we subtract if the position in the sequence is odd
                estimationValue -= (1/denominator);
            } else {
                // following the formula, we add if the position in the sequence is even
                estimationValue += (1/denominator);
            }
            // 2 is added, so it follows the formula (-1/3, +1/5, -1/7, +1/9, etc..)
            denominator += 2;
        }

        // In the formula, we see the estimation value is equivalent to Pi/4, so we multiply by 4 to get the value of Pi. 
        double Pi = estimationValue*4;
        System.out.println(Pi);
        input.close();
    }
}
