import java.util.*;

public class Collatz {
    public static void main(String[] args) {
        System.out.println("Enter odd integer greater than 1.");

        Scanner intScanner = new Scanner(System.in);
        int oddInt = intScanner.nextInt();
        if (!(oddInt > 1)) {
            System.out.println("Please enter a number greater than 1.");
        }
        else {
            ArrayList<Integer> numbArray = new ArrayList<Integer>();
            numbArray.add(oddInt);
            int currentNumber = oddInt;
            while (currentNumber != 1) {
                //numbArray[numbArray.length] = collatzStep(currentNumber);
                currentNumber = collatzStep(currentNumber);
                numbArray.add(currentNumber);
            }
            System.out.println("Total steps: " + numbArray.size());
            System.out.print("Step sequence: ");
            for (int i: numbArray) {
                System.out.print(i + " ");
            }
            
        }
        intScanner.close();
    }
    static int collatzStep(int numb) {
        if ((numb%2) != 0) {
            return numb*3 + 1;
        }
        else {
            return numb/2;
        }
    }
}
