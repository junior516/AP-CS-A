
import java.util.Scanner;

public class WageLab {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // retrieve hourly wage
    System.out.println("Enter hourly wage in dollars: ");
    double hourlyWage = input.nextDouble();

    // retrieve total regular hours
    System.out.println("Enter total regular hours for week: ");
    double regularHours = input.nextDouble();
    double regularPay = regularHours*hourlyWage;

    // retrieve total overtime hours
    System.out.println("Enter total overtime hours for week: ");
    double overtimeHours = input.nextDouble();
    double overtimePay = (overtimeHours*hourlyWage)*1.5;

    // calculate total weekly pay
    double totalPay = regularPay+overtimePay;
    System.out.println("Total weekly pay: $" + totalPay);

    input.close();
  }
}