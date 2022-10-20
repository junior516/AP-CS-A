import java.text.DecimalFormat;
import java.util.*;

public class TelephoneCall {
    public static void main(String[] args) {
        // initialize prices
        double initialPrice = 2.45;
        double priceForExtraMinutes = 0.75;

        // request number of minutes for phone call
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of minutes for San Diego telephone call: ");

        int totalMinutes = input.nextInt();
        int extraMinutes = totalMinutes - 2;
        
        // format decimals to hundredths, for example 7 -> 7.00
        DecimalFormat hundredths = new DecimalFormat("0.00");
        
        // make sure extraMinutes isn't negative so we don't lose on the cost
        if (extraMinutes < 0) {
            extraMinutes = 0;
        }

        // calculate total price of call
        double totalPrice = initialPrice + (priceForExtraMinutes * extraMinutes);

        // print total price of call
        System.out.println("Total cost of call: $" + hundredths.format(totalPrice));

        input.close();
    }
}
