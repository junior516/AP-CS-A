import java.util.*;
public class PermutationsLab {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Enter a number between 5 and 20 for array size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size >= 5 && size <= 20) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = i + 1;
            }
            System.out.println("The permutations of the array are:");
            break;
        } else {
            System.out.println("Invalid input.");
        }
        input.close();
        }
    }
}
