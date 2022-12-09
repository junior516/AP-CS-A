// Race Horse Lab

// Part 1:  Write a class “Horse” which has the following components:

// 	Private Data Fields:	location – the horse’s location on a 15-unit track.
// 				Must be an integer between 1-15.  i.e., if location is 1 the
// 				horse is at the start, at 8 the horse is halfway down, at 15 
// 				the horse is at the finish line.
// 				index – the identifying number of the horse.  
// ***the Horse’s data fields MUST be declared as private.

// Methods:	Horse()  - a Default Constructor that initializes a horse to location 1 and index 0.
// Horse(int loc, int i) - a Constructor that initializes a horses data fields to the two integer arguments sent to it.
// getLocation() – an Accessor method that returns the horses current location.
// getIndex() – an Accessor method that returns the horses index.
// advance() – a Mutator method that adds 1 to the horses location as long as it is less than 15 (the track size).
// raceStride() – this might make the horse move forward based on a mathematical probability.  Use “random” to generate a random integer from 1 to 100.  The horse will advance (towards the finish line) if the number is less than 50.
// toString() – this method needs to be overloaded so that it shows the track and the horses current location on the track (identified by its index).  If a horse with index 3 is halfway down the track, writing out the horse will look like this:  |-------3-------|
// When the horse class is complete, write a short HorseDriver program (in another file) which will create and test a horse object.

public class Horse {
    private int location;
    private int index;  // the identifying number of the horse  

    public Horse() {
        location = 1;
        index = 0;
    }


    public Horse(int loc, int i) {
        location = loc;
        index = i;
    }

    public int getLocation() {
        return location;
    }

    public int getIndex() {
        return index;
    }

    public void advance() {
        if (location < 15) {
            location++;
        }
    }

    public void raceStride() {
        int random = (int) (Math.random() * 100) + 1;
        if (random < 50) {
            advance();
        }
    }


    public String toString() {
        String track = "|";
        for (int i = 1; i <= 15; i++) {
            if (i == location) {
                track += index;
            } else {
                track += "-";
            }
        }
        track += "|";
        return track;
    }
}