import java.util.*;
class Program {
static int getSurfaceAreaFromEdgeLength(int edgelength) // function to get surface area from edge length 
      {
      int totalEdgeLength = 6*(edgelength*edgelength);
      return totalEdgeLength;
      }
   public static void main(String args[]) {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("Type in the length of an edge to get the surface area of the cube in units:");
      int elength = myScanner.nextInt(); // reads next line for integer
      int surfacearea = getSurfaceAreaFromEdgeLength(elength); // retrieve surface area from edge length
      System.out.println("Edge length is: " + elength + " u"); // Outputs edge length
      System.out.println("Surface area is: " + surfacearea + " u^2"); // Outputs surface area
}
}