package java2.lesson1;

public class Treadmill implements Barrier {
    private final int dinstance;

    public Treadmill(int dinstance) {
        this.dinstance = dinstance;
    }

    @Override
    public void overcome(Player player) {
        player.run(this);
    }

    public int getDinstance() {
        return dinstance;
    }

    @Override
    public String toString() {
        return " беговую дорожку длинной " + dinstance + " метров.";
    }
}
