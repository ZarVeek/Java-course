package ru.CatsAndFood;

import java.util.Random;

class Plate {

    private int food;

    Plate (int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    void decreaseFood(int eatenFood){
        food -= eatenFood;
    }

    void increaseFood(int addFood){
        food += addFood;
    }
}
