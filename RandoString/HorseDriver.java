

public class HorseDriver {
    public static void main(String[] args) {
        Horse horse1 = new Horse(1, 0);
        Horse horse2 = new Horse(1, 1);
        Horse horse3 = new Horse(1, 2);
        int winner = 0;
        while (winner == 0) {
            horse1.raceStride();
            horse2.raceStride();
            horse3.raceStride();
            System.out.println(horse1);
            System.out.println(horse2);
            System.out.println(horse3);
            if (horse1.getLocation() == 15) {
                winner = 1;
            } else if (horse2.getLocation() == 15) {
                winner = 2;
            } else if (horse3.getLocation() == 15) {
                winner = 3;
            }
        }
        System.out.println("The winner is horse " + winner);
    }
}















