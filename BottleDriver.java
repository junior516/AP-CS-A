import java.util.*;

public class BottleDriver {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        String col;
        int vol;
        Scanner input = new Scanner(System.in);
        System.out.println("Color of second bottle?");
        col = input.nextLine();
        System.out.println("Ounces of second bottle?");
        vol = input.nextInt();
        Bottle bottle2 = new Bottle(col, vol);
        int totalVol = bottle1.getNumberOfOunces() + vol;
        System.out.println(bottle1.toString());
        System.out.println(bottle2.toString());
        System.out.println("Total volume: " + totalVol + " ounces");
        input.close();
    }
}