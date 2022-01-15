package java2.lesson1;

public class Wall implements Barrier {
    private final int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void overcome(Player player) {
        player.jump(this);
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return " cтену высотой " + hight + "метров.";
    }
}
