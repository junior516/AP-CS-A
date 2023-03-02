
public class Horse {
    private int location;
    private int index;

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