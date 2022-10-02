public class RandoString
{
   public static void main(String[] args)
   {
      String hello = "hello";
      String bye = "goodbye";
      
      // Goal: Create a new String named combo by inserting
      // the contents of the hello string at a randomly
      // selected position in the bye String. For example,
      // one potential result would be goohellodbye and another
      // might be goodbhelloye. You will write and call the
      // combine method to accomplish this.
     
      // TODO 2. call the combine method 
      String newCombinedString = combine(hello, bye);
      // TODO 3. print out the new String
      System.out.println(newCombinedString);
      // TODO 4. print out the new String in ALL CAPS
      System.out.println(newCombinedString.toUpperCase());
      // TODO 5. print out the location of ll in the new string
      System.out.println("ll is at location: " + newCombinedString.indexOf("ll"));
   }
   
   // TODO 1. combine method (Do This First)
   // Write the combine method here (be sure to make it static)
   // It should accept two Strings as input and produce a String for output
   // The new String should NOT be printed in this method.
   // The method will generate a random number.
   // The number generated should be a valid index in the second input String
   // The produced String should be the result of inserting the first input
   // string into the second input string at a randomly selected location.
   // TODO 1A. start by writing the method Header here
   public static String combine(String str1, String str2)
   {
      // TODO 1B.
      // generate an appropriate random number here. What should the bounds be?
      int max = str2.length();
      int min = 0;
      int range = max - min + 1;
      int randNumber = (int)(Math.random()*range) + min;
      // TODO 1C.
      // print out the random number in the proper format
      // (random is: n)
      System.out.println("random is: " + randNumber);
      // TODO 1D.
      // build the new String here
      String splitString1 = str2.substring(min, randNumber);
      String splitString2 = str2.substring(randNumber, str2.length());
      String combinedString = splitString1+str1+splitString2;
      // TODO 1E.
      // send the new String back to the caller (do not print here!)
      return combinedString;
   }

}