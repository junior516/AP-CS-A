// Die Class
public class Die {
    private int side = 1;

    public Die() {
        roll();
    }

    public int getSide() {
        return side;
    }

    public void roll() {
        side = (int) (Math.random() * 6) + 1;
    }
}


