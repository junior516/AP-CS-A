// Part 2:  Expand the HorseDriver program to create three instances of horse objects using Horse.java. Each horse index will be a consecutive number from 0 to 2.  Showing each horse as they race down the track might look like this:
// |----0----------|
// |--1------------|
// |------2--------|

// A method in the driver should allow for one iteration of the race to occur, in which each horse has a chance of advancing (based on the random). This can be called in a loop until 
// one or more horses crosses the finish line, thus ending the race. Print the name of the winner(s) of the race.

// If everything works and only a single winner is declared even if it is a tie, the program will net 95%.
// If a tie situation reports the index of every horse that won, the program will net 100%.

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

//q: how do you escape prison? (step by step detail)














