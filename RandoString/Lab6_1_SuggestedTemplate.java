import java.util.Scanner;

public class Lab6_1_SuggestedTemplate{

   private static double getAverage(double[] nums){
      double sum = 0;
    
      for (double numb: nums) {
         sum += numb;
      }

      return sum/nums.length; 
   }
   
   private static void showLargerValues(double[] nums, double avg){
      System.out.print("Values Greater Than Average: ");
      for (double numb: nums) {
         if (numb > avg) {
            System.out.print(numb+" ");
         }
      }
   }
   
   public static void main(String[] args){
      double[] nums = new double[10];
      Scanner input = new Scanner(System.in);
      for (int i = 1; i <= 10; i++) {
         double newDouble = input.nextDouble();
         nums[i-1] = newDouble;
         System.out.println("#"+i+":"+" "+newDouble);
      }
      double average = getAverage(nums);
      System.out.println("Average: "+average);
      showLargerValues(nums, average);
      input.close();
   }
}