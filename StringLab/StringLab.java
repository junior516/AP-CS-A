public class StringLab
{
   // This lab provides practice using String methods
   public static void main(String[] args)
   {
      String myString = "The world is not flat.";
      String roundString = "round.";
      
      System.out.println(myString);
      
      // Use a String method to print out how long the string is
      /* 1. your code goes here */
      System.out.println("The number of characters is: " + myString.length());
      // Use the one argument substring method to create a new string
      // that contains everything from myString from the "n" in not to the end
      String newString = "";
      /* 2. your code goes here */
      newString = myString.substring(13, 22);
      System.out.println(newString);
      
      // use the two argument substring method to extract the word "world"
      // from myString into a new String variable named world
      // print out the countents of the variable
      String world = "";
      /* 3. your code goes here*/
      world = myString.substring(4, 9);
      System.out.println(world);
      
      // print out the contents the world variable in all UPPERCASE
      /* 4. your code goes here */
      System.out.println(world.toUpperCase());
      
      // use the appropriate String method to find and print
      // the index of the word "flat" from myString
      /* 5. your code goes here */
      int flatVar = myString.indexOf("flat");
      System.out.println("flat is at index " + flatVar);
      // Using myString and roundString, use substring and concatenation
      // to create a new String variable named roundWorld that contains
      // "The world is round."
      String roundWorld = "";
      /* 6. your code goes here */
      roundWorld = myString.substring(0, 13).concat(roundString);

      System.out.println(roundWorld);
      
      // use the appropriate String method to find and print
      // the index of the word "flat" from roundWorld
      /* 7. your code goes here */
      int flatVar2 = roundWorld.indexOf("flat");
      System.out.println("flat is at index " + flatVar2);
   }
}