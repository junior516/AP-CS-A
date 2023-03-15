import java.util.*;

public class HorseDriver {

    static String getTied(Horse[] winners) {
        String tied = "";
        for (int i = 0; i < winners.length; i++) {
            if (winners[i] != null) {
                tied += "Horse " + winners[i].getIndex() + " ";
                if (i < getNumWinners(winners) - 1) {
                    tied += "and ";
                }
            }
        }
        return tied;
    }

    static int getNumWinners(Horse[] winners) {
        int numWinners = 0;
        for (int i = 0; i < winners.length; i++) {
            if (winners[i] != null) {
                numWinners++;
            }
        }
        return numWinners;
    }

    static boolean horseFinished(Horse[] horses) {
        for (int i = 0; i < horses.length; i++) {
            if (horses[i].getLocation() >= 15) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many horses do you want on the track?");
        int numHorses = input.nextInt();
        Horse[] horses = new Horse[numHorses];
        for (int i = 0; i < numHorses; i++) {
            int randomNumb = (int) (Math.random() * 100) + 1;
            if (randomNumb <= 50) {
                horses[i] = new Filly(1, i);
            } else {
                horses[i] = new Horse(1, i);
            }
        }
        Horse[] winners = new Horse[numHorses];
        while (!(horseFinished(horses))) {
            for (int i = 0; i < numHorses; i++) {
                horses[i].raceStride();
                System.out.println(horses[i]);
            }
            for (int i = 0; i < numHorses; i++) {
                if (horses[i].getLocation() == 15) {
                    winners[getNumWinners(winners)] = horses[i];
                }
            }
        }
        if (getNumWinners(winners) == 1) {
            System.out.println("The winner is Horse " + winners[0].getIndex() + "!");
        } else {
            System.out.println("Competitors in tie: " + getTied(winners));
        }
        input.close();
    }
}