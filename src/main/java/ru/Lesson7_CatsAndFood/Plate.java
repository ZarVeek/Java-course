package ru.Lesson7_CatsAndFood;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        }
        return false;
    }


    void increaseFood(int addFood){
        if (addFood > 0) {
            food += addFood;
        }
    }


}
