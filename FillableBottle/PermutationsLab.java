import java.util.*;

public class PermutationsLab {
    static int[] shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int newIndex = (int) (Math.random() * array.length);
            int oldValue = array[i];
            array[i] = array[newIndex];
            array[newIndex] = oldValue;
        }
        return array;
    }

    static boolean inAscending(int[] array) {
        boolean failed = false;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] == i + 1)) {
                failed = true;
            }
        }
        return !failed;
    }

    static void playGame() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements (5-20) would you like to shuffle?");
        int chosenNumber = input.nextInt();
        while (!(chosenNumber >= 5 && chosenNumber <= 20)) {
            System.out.println("How many elements (5-20) would you like to shuffle?");
            chosenNumber = input.nextInt();
        }
        int[] intArray = new int[chosenNumber];
        int turns = (2 * chosenNumber) - 3;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        ;
        int[] shuffledArray = shuffle(intArray);
        System.out.println("Here is your shuffled array:");
        for (int i : shuffledArray) {
            System.out.print(i + " ");
        }
        System.out.println("");
        while ((turns > 0) || inAscending(intArray)) {
            System.out.println("You have " + turns + " turns remaining.");
            System.out.println("Enter # of elements (2 - " + chosenNumber + ") to reverse: ");
            int numOfElements = input.nextInt();
            while (((numOfElements < 2) || (numOfElements > chosenNumber))) {
                System.out.println("Enter # of elements (2 - " + chosenNumber + ") to reverse: ");
                numOfElements = input.nextInt();
            }
            int reverseIndex = numOfElements;
            for (int i = 0; i < reverseIndex / 2; i++) {
                int oldValue = shuffledArray[i];
                shuffledArray[i] = shuffledArray[reverseIndex - i - 1];
                shuffledArray[reverseIndex - i - 1] = oldValue;
            }
            System.out.println("Here is your array with the first " + numOfElements + " reversed.");
            for (int i : shuffledArray) {
                System.out.print(i + " ");
            }
            if (turns <= 1) {
                System.out.println("Out of turns - Game Over!");
                break;
            } else {
                if (inAscending(shuffledArray)) {
                System.out.println("Congratulations - You sorted it all out!");
                break;
                }
            }
            turns--;
        }
        System.out.println("Would you like to play the game again?");
        System.out.println("Enter 1 for yes");
        System.out.println("Enter 2 for no");
        int answer = input.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println("Enter 1 for yes");
            System.out.println("Enter 2 for no");
        }
        if (answer == 1) {
            playGame();
        } else {
            System.out.println("Good-bye!");
        }
        input.close();
        
    }

    public static void main(String[] args) {
        playGame();
    }
}
