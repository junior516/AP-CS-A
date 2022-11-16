public class LoopyMethods {

    // main method to test functions
    public static void main(String[] args)
    {
        System.out.print("Expected: ");
        System.out.println("* * * * * *");
        System.out.print("  Actual: ");
        printStars(6);
        System.out.println();
        
        System.out.print("Expected: ");
        System.out.println("8 16 24 32 40 48 56 64 72 80 88 96");
        System.out.print("  Actual: ");
        printMults(8, 100);
        System.out.println();
        
        System.out.println("Expected: 4");
        System.out.println("  Actual: " + countEs("Elmer is an elephant."));
        System.out.println("Expected: 3");
        System.out.println("  Actual: " + countEs("Isn't Elastigirl incredible?"));  
    }
  
  

    public static void printStars(int n) {
        // run for loop until i reaches n, the total amount of stars to print
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i != n) {
                System.out.print(" ");
            }
        }
    }

    public static void printMults(int num, int limit) {
        int mult = 1;
        // for loop prints multiples each time, until the multiple is greater than the limit
        for (int i = 1; ((num * i) < limit); i++) {
            mult = num * (i);
            System.out.print(mult + " ");
        }
    }

    public static int countEs(String sentence) {
        int count = 0;
        // for loop checks for each letter using substring, and sees if the letter is "E" or "e" and adds it to the count
        for (int i = 1; i < sentence.length(); i++) {
            String character = sentence.substring(i-1, i);
            if (character.equals("E") || character.equals("e")) {
                count += 1;
            }
        }

        return count;
    }

}