public class NEWTEST {
  static double findAverageAge(int [] arrayOfInts) {
    double sum = 0;
    for (int integer: arrayOfInts) {
     sum += integer;
    }
    double average = sum/arrayOfInts.length;
    return average;
  }

public static void main(String[] args) {
  int [] myArray = {50, 23, 54, 23, 78, 46, 32};
  System.out.println(findAverageAge(myArray));
}
}

