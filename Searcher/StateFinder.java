
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class StateFinder {
    // Binary search function for State names, uses compareTo in order to sort
    // alphabetically
    public static int binarySearch(State[] states, String state) {
        int low = 0;
        int high = states.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String name = states[mid].getName().toUpperCase();
            if (name.compareTo(state.toUpperCase()) < 0) {
                low = mid + 1;
            } else if (name.compareTo(state.toUpperCase()) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Linear search function for State abbreviations and capitals
    public static int linearSearch(State[] states, String state) {
        for (int i = 0; i < states.length; i++) {
            String abb = states[i].getAbbreviation().toUpperCase();
            String cap = states[i].getCapital().toUpperCase();
            if (abb.equals(state.toUpperCase()) || cap.equals(state.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, InputMismatchException {
        // Reads in the states.txt file and creates an array of State objects
        try {
            Scanner file = new Scanner(new FileReader("states.txt"));
            State[] states = new State[51];
            int i = 0;
            while (file.hasNextLine()) {
                String abb = file.nextLine().trim();
                String name = file.nextLine().trim();
                String capital = file.nextLine().trim();
                states[i] = new State(name, abb, capital);
                i++;
            }
            file.close();
            Scanner input = new Scanner(System.in);
            boolean quit = false;
            do {
                // Prompts the user to search by abbreviation, capital, or name
                System.out.println("Enter 1 to search by abbreviation: ");
                System.out.println("Enter 2 to search by capital: ");
                System.out.println("Enter 3 to search by name: ");
                System.out.println("Enter -1 to exit: ");
                int choice = input.nextInt();
                input.nextLine();
                // Calls the appropriate search function based on the user's choice
                if (choice == 1) {
                    System.out.println("Enter the abbreviation: ");
                    String state = input.nextLine();
                    int index = linearSearch(states, state);
                    if (index == -1) {
                        System.out.println("State not found.");
                    } else {
                        System.out.println(states[index]);
                    }
                } else if (choice == 2) {
                    System.out.println("Enter the capital: ");
                    String state = input.nextLine();
                    int index = linearSearch(states, state);
                    if (index == -1) {
                        System.out.println("Capital not found.");
                    } else {
                        System.out.println(states[index]);
                    }
                } else if (choice == 3) {
                    System.out.println("Enter the name: ");
                    String state = input.nextLine();
                    int index = binarySearch(states, state);
                    if (index == -1) {
                        System.out.println("State not found.");
                    } else {
                        System.out.println(states[index]);
                    }
                } else if (choice == -1) {
                    System.out.println("Goodbye!");
                    quit = true;
                    break;
                } else {
                    System.out.println("Please enter a valid menu choice.");
                }
            } while (!quit);
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            main(args);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            main(args);
        }
    }
}
