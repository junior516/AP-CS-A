import java.util.*;

public class IntegerArrayLab {

  private static void showArray(String arrayName, int[] array, int counter) {
    System.out.print(arrayName);
    for (int i = 0; i < counter; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {

    int[] evenArray = new int[10];
    int evenCounter = 0;

    int[] oddArray = new int[10];
    int oddCounter = 0;

    int[] negativeArray = new int[10];
    int negativeCounter = 0;

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter an integer: ");
      int integerInput = input.nextInt();

      if (integerInput % 2 == 0) {
        evenArray[evenCounter] = integerInput;
        evenCounter++;
      }

      if (integerInput % 2 != 0) {
        oddArray[oddCounter] = integerInput;
        oddCounter++;
      }

      if (integerInput < 0) {
        negativeArray[negativeCounter] = integerInput;
        negativeCounter++;
      }

    }

    input.close();
    showArray("Evens: ", evenArray, evenCounter);
    showArray("Odds: ", oddArray, oddCounter);
    showArray("Negatives: ", negativeArray, negativeCounter);
  }
}