public class Filly extends Horse {
    private int fillyPower = 0;

    public Filly() {
        super();
        fillyPower = (int) (Math.random() * 61) + 30;
    }

    public Filly(int loc, int i) {
        super(loc, i);
        fillyPower = (int) (Math.random() * 61) + 30;
    }

    public void raceStride() {
        int random = (int) (Math.random() * 100) + 1;
        if (random < fillyPower) {
            advance();
        }
    }

    @Override
    public String toString() {
        String track = "|";
        for (int i = 1; i <= 15; i++) {
            if (i == getLocation()) {
                track += getIndex();
            } else {
                track += "-";
            }
        }
        track += "|*";
        return track;
    }
}
