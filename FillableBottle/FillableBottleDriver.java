import java.util.*;

public class FillableBottleDriver {
    public static void main(String[] args) {
        FillableBottle bottle1 = new FillableBottle();
        String col;
        int vol;
        Scanner input = new Scanner(System.in);
        System.out.println("Color of second bottle?");
        col = input.nextLine();
        System.out.println("Volume of second bottle?");
        vol = input.nextInt();
        FillableBottle bottle2 = new FillableBottle(col, vol);
        System.out.println(bottle1.toString());
        System.out.println(bottle2.toString());
        System.out.println("Choose the number of ounces you want to add:");
        int added = input.nextInt();
        System.out.println("adding ...");
        bottle1.add(added);
        bottle2.add(added);
        System.out.println(bottle1.toString());
        System.out.println(bottle2.toString());
        System.out.println("removing ...");
        bottle1.remove();
        int removedOunces = bottle2.remove();
        System.out.println("removed " + removedOunces + " ounces from the " + bottle2.getColor() + " bottle.");
        System.out.println(bottle1.toString());
        System.out.println(bottle2.toString());
        input.close();
    }
}
