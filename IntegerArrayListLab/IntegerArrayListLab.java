import java.util.*;

public class IntegerArrayListLab {

  public static void main(String[] args) {

    ArrayList<Integer> evenArray = new ArrayList<Integer>();

    ArrayList<Integer> oddArray = new ArrayList<Integer>();

    ArrayList<Integer> negativeArray = new ArrayList<Integer>();

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter an integer: ");
      int integerInput = input.nextInt();

      if (integerInput % 2 == 0) {
        evenArray.add(integerInput);
      }

      if (integerInput % 2 != 0) {
        oddArray.add(integerInput);
      }

      if (integerInput < 0) {
        negativeArray.add(integerInput);
      }

    }

    input.close();
    System.out.print("Evens: ");
    System.out.println(evenArray);
    System.out.print("Odds: ");
    System.out.println(oddArray);
    System.out.print("Negatives: ");
    System.out.println(negativeArray);
  }
}