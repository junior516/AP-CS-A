import java.util.*;

public class PopulationGrowth {
    public static void main(String[] args) {

        // For this program, assume total number of hours are whole

        Scanner input = new Scanner(System.in);
        // retrieve initial organisms
        System.out.println("Inital number of organisms?");
        double initialOrganisms = input.nextDouble();

        // retrieve growth rate
        System.out.println("Rate of growth per growth period?");
        double growthRate = input.nextDouble();

        // retrieve growth period
        System.out.println("Growth period for rate?");
        double growthPeriod = input.nextDouble();

        // retrieve total number of hours
        System.out.println("Total number of hours?");
        int numHours = input.nextInt();

        // calculate rate of growth per hour
        double growthPerHour = Math.pow(growthRate, 1 / growthPeriod);
        double totalOrganisms = initialOrganisms;

        // every hour, multiply organisms by rate of growth per hour
        for (int i = 0; i < numHours; i++) {
            totalOrganisms = totalOrganisms * growthPerHour;
        }

        // round total organisms due to floating point error
        totalOrganisms = Math.round(totalOrganisms);

        // print total population size
        System.out.print("Population size: " + totalOrganisms);
        input.close();
    }
}