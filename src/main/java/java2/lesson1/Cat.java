package java2.lesson1;

public class Cat implements Player {

    private boolean play = true;
    private static final int runLimit = 15;
    private static final int jumpLimit = 5;

    @Override
    public boolean isPlayer() {
        return play;
    }

    @Override
    public void setPlay(boolean success) {
        this.play = success;
    }

    @Override
    public int getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public String toString() {
        return "Cat ";
    }
}
