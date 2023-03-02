import java.util.*;

public class PersonDriver {
    // get input from the user
    static Scanner input = new Scanner(System.in);

    // create a person object and add it to the ArrayList
    static void addPerson(ArrayList<Person> people) {
        System.out.println("Enter the age, name, and eye color of person " + (people.size() + 1) + ": ");
        System.out.println("Age of person " + (people.size() + 1) + ": ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Name of person " + (people.size() + 1) + ": ");
        String name = input.nextLine();
        System.out.println("Eye color of person " + (people.size() + 1) + ": ");
        String eyeColor = input.nextLine();
        Person person = new Person(age, name, eyeColor);
        people.add(person);
        System.out.println("New person added.");
    }

    // remove a person from the ArrayList
    static void removePerson(ArrayList<Person> people) {
        System.out.println("Enter the name of the person you want to remove: ");
        String name = input.nextLine();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                people.remove(i);
            }
        }
        System.out.println(name + " removed.");
    }

    // sort the ArrayList
    static void sortPeople(ArrayList<Person> people) {
        for (int i = 1; i < people.size(); i++) {
            Person temp = people.get(i);
            int j = i - 1;
            while (j >= 0 && people.get(j).compareTo(temp) > 0) {
                people.set(j + 1, people.get(j));
                j--;
            }
            people.set(j + 1, temp);
        }
        System.out.println("Sort Done.");
    }

    // display the ArrayList
    static void displayPeople(ArrayList<Person> people) {
        System.out.println("PEOPLE:");
        System.out.println(people);
    }

    public static void main(String[] args) throws InputMismatchException {
        try {
            System.out.println("Enter 1 to add a person");
            System.out.println("Enter 2 to remove a person");
            System.out.println("Enter 3 to sort the people");
            System.out.println("Enter 4 to display the people");
            System.out.println("Enter 5 to exit");
            int choice = input.nextInt();
            input.nextLine();
            ArrayList<Person> people = new ArrayList<Person>();
            while (choice != 5) {
                if (choice == 1) {
                    addPerson(people);
                } else if (choice == 2) {
                    removePerson(people);
                } else if (choice == 3) {
                    sortPeople(people);
                } else if (choice == 4) {
                    displayPeople(people);
                } else {
                    System.out.println("Invalid input.");
                }
                System.out.println("Enter 1 to add a person");
                System.out.println("Enter 2 to remove a person");
                System.out.println("Enter 3 to sort the people");
                System.out.println("Enter 4 to display the people");
                System.out.println("Enter 5 to exit");
                choice = input.nextInt();
                input.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }
}
