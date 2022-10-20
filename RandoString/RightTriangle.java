import java.util.*;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // retrieve length of first side
        System.out.println("Enter the length of one side: ");
        int sideLength1 = input.nextInt();
        // retrieve length of second side
        System.out.println("Enter the length of another side: ");
        int sideLength2 = input.nextInt();
        // retrieve length of third side
        System.out.println("Enter the length of one more side: ");
        int sideLength3 = input.nextInt();
        // get squared length for pythagorean theorem, a^2 + b^2 = c^2
        int side1Squared = sideLength1 * sideLength1;
        int side2Squared = sideLength2 * sideLength2;
        int side3Squared = sideLength3 * sideLength3;

        input.close();
        // checking for all sides using pythagorean theorem
        if (side1Squared == side2Squared + side3Squared || side2Squared == side1Squared + side3Squared
                || side3Squared == side1Squared + side2Squared) {
            System.out.println("This triangle is a right triangle");
        } else {
            System.out.println("This triangle is NOT a right triangle");
        }
    }
}