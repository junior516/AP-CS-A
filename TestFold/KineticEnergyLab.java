import java.util.Scanner;
public class KineticEnergyLab {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // retrieve mass
        System.out.println("Enter mass here in kg: ");
        int mass = myScanner.nextInt();

        // retrieve velocity
        System.out.println("Enter velocity here in m/s: ");
        int velocity = myScanner.nextInt();
        // output momentum
        System.out.println("Momentum: " + (mass*velocity) + " kg m/s");

        // output kinetic energy
        System.out.println("Kinetic Energy: " + 0.5*(mass*Math.pow(velocity, 2)) + " J");
        myScanner.close();
    }
}